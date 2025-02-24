package com.openai.infrastructure

import com.openai.models.RealtimeSessionMaxResponseOutputTokensAdapter
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.lang.reflect.Type

//
// region SerializeNull https://stackoverflow.com/a/71877976/252308
//

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class SerializeNull {
    companion object {
        class Factory : JsonAdapter.Factory {
            override fun create(
                type: Type,
                annotations: MutableSet<out Annotation>,
                moshi: Moshi,
            ): JsonAdapter<*>? {
                val nextAnnotations =
                    Types.nextAnnotations(
                        annotations,
                        SerializeNull::class.java,
                    )
                return if (nextAnnotations == null) {
                    null
                } else {
                    NullIfNullJsonAdapter<Any>(
                        moshi.nextAdapter(this, type, nextAnnotations)
                    )
                }
            }
        }

        class NullIfNullJsonAdapter<T>(private val delegate: JsonAdapter<T>) :
            JsonAdapter<T>() {
            override fun fromJson(reader: JsonReader): T? {
                return delegate.fromJson(reader)
            }

            override fun toJson(writer: JsonWriter, value: T?) {
                if (value == null) {
                    val serializeNulls: Boolean = writer.serializeNulls
                    writer.serializeNulls = true
                    try {
                        delegate.toJson(writer, value)
                    } finally {
                        writer.serializeNulls = serializeNulls
                    }
                } else {
                    delegate.toJson(writer, value)
                }
            }
        }
    }
}

//
// endregion
//

object Serializer {
    @JvmStatic
    val moshiBuilder: Moshi.Builder =
        Moshi.Builder()
            .add(SerializeNull.Companion.Factory())
            .add(OffsetDateTimeAdapter())
            .add(LocalDateTimeAdapter())
            .add(LocalDateAdapter())
            .add(UUIDAdapter())
            .add(ByteArrayAdapter())
            .add(URIAdapter())
            .add(RealtimeSessionMaxResponseOutputTokensAdapter())
            .add(KotlinJsonAdapterFactory())
            .add(BigDecimalAdapter())
            .add(BigIntegerAdapter())

    @JvmStatic val moshi: Moshi by lazy { moshiBuilder.build() }

    @OptIn(ExperimentalStdlibApi::class)
    inline fun <reified T> deserialize(json: String?): T? {
        return if (json.isNullOrBlank()) null
        else moshi.adapter<T>().fromJson(json)
    }

    @OptIn(ExperimentalStdlibApi::class)
    inline fun <reified T> serialize(obj: T): String {
        return moshi.adapter<T>().toJson(obj)
    }
}

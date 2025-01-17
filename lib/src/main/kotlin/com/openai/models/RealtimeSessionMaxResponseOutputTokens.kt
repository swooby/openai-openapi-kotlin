/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.openai.models

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.ToJson

/**
 * Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
 *
 */
open class RealtimeSessionMaxResponseOutputTokens {
    data class Numeric(val value: Int) : RealtimeSessionMaxResponseOutputTokens()
    data object Inf : RealtimeSessionMaxResponseOutputTokens()
}

class RealtimeSessionMaxResponseOutputTokensAdapter : JsonAdapter<RealtimeSessionMaxResponseOutputTokens>() {
    @FromJson
    override fun fromJson(reader: JsonReader): RealtimeSessionMaxResponseOutputTokens? {
        return when (reader.peek()) {
            JsonReader.Token.NUMBER -> {
                RealtimeSessionMaxResponseOutputTokens.Numeric(reader.nextInt())
            }
            JsonReader.Token.STRING -> {
                val value = reader.nextString()
                if (value == "inf") {
                    RealtimeSessionMaxResponseOutputTokens.Inf
                } else {
                    // If the server only ever gives "inf" or numbers,
                    // you might consider throwing or returning null for an unrecognized string.
                    throw JsonDataException("Unknown string for max_response_output_tokens: $value")
                }
            }
            JsonReader.Token.NULL -> {
                // The server might omit or return null
                reader.nextNull<Unit>()
                null
            }
            else -> {
                // Some unexpected type
                throw JsonDataException(
                    "Expected NUMBER or STRING for max_response_output_tokens but was ${reader.peek()}"
                )
            }
        }
    }

    @ToJson
    override fun toJson(writer: JsonWriter, value: RealtimeSessionMaxResponseOutputTokens?) {
        if (value == null) {
            writer.nullValue()
            return
        }
        when (value) {
            is RealtimeSessionMaxResponseOutputTokens.Numeric -> writer.value(value.value)
            is RealtimeSessionMaxResponseOutputTokens.Inf     -> writer.value("inf")
        }
    }
}

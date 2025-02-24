/**
 * Please note: This class is auto generated by OpenAPI Generator
 * (https://openapi-generator.tech). Do not edit this file manually.
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package com.openai.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the
 * `auto` strategy. Only applicable if `file_ids` is non-empty.
 *
 * @param type Always `auto`.
 * @param static
 */
data class CreateVectorStoreRequestChunkingStrategy(

    /* Always `auto`. */
    @Json(name = "type")
    val type: CreateVectorStoreRequestChunkingStrategy.Type,
    @Json(name = "static") val static: StaticChunkingStrategy,
) {

    /**
     * Always `auto`.
     *
     * Values: auto,static
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "auto") auto("auto"),
        @Json(name = "static") static("static"),
    }
}

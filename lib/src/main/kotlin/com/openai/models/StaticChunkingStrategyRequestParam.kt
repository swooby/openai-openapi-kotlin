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
 * @param type Always `static`.
 * @param static
 */
data class StaticChunkingStrategyRequestParam(

    /* Always `static`. */
    @Json(name = "type") val type: StaticChunkingStrategyRequestParam.Type,
    @Json(name = "static") val static: StaticChunkingStrategy,
) {

    /**
     * Always `static`.
     *
     * Values: static
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "static") static("static")
    }
}

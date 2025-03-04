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

/** @param type The type of response format being defined: `text` */
data class ResponseFormatText(

    /* The type of response format being defined: `text` */
    @Json(name = "type") val type: ResponseFormatText.Type
) {

    /**
     * The type of response format being defined: `text`
     *
     * Values: text
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "text") text("text")
    }
}

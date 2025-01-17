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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An object describing text to classify.
 *
 * @param type Always `text`.
 * @param text A string of text to classify.
 */


data class CreateModerationRequestInputOneOfInnerOneOf1 (

    /* Always `text`. */
    @Json(name = "type")
    val type: CreateModerationRequestInputOneOfInnerOneOf1.Type,

    /* A string of text to classify. */
    @Json(name = "text")
    val text: kotlin.String

) {

    /**
     * Always `text`.
     *
     * Values: text
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "text") text("text");
    }

}

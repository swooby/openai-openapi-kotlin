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
 * The text content that is part of a message.
 *
 * @param type Always `text`.
 * @param text Text content to be sent to the model
 */


data class MessageRequestContentTextObject (

    /* Always `text`. */
    @Json(name = "type")
    val type: MessageRequestContentTextObject.Type,

    /* Text content to be sent to the model */
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


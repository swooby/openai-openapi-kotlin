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
 * References an image URL in the content of a message.
 *
 * @param index The index of the content part in the message.
 * @param type Always `image_url`.
 * @param imageUrl
 */
data class MessageDeltaContentImageUrlObject(

    /* The index of the content part in the message. */
    @Json(name = "index") val index: kotlin.Int,

    /* Always `image_url`. */
    @Json(name = "type") val type: MessageDeltaContentImageUrlObject.Type,
    @Json(name = "image_url")
    val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null,
) {

    /**
     * Always `image_url`.
     *
     * Values: image_url
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "image_url") image_url("image_url")
    }
}

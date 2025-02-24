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
 * Learn about [image inputs](/docs/guides/vision).
 *
 * @param type The type of the content part.
 * @param imageUrl
 */
data class ChatCompletionRequestMessageContentPartImage(

    /* The type of the content part. */
    @Json(name = "type")
    val type: ChatCompletionRequestMessageContentPartImage.Type,
    @Json(name = "image_url")
    val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl,
) {

    /**
     * The type of the content part.
     *
     * Values: image_url
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "image_url") image_url("image_url")
    }
}

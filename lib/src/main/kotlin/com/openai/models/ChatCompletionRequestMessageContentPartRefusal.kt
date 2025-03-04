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
 * @param type The type of the content part.
 * @param refusal The refusal message generated by the model.
 */
data class ChatCompletionRequestMessageContentPartRefusal(

    /* The type of the content part. */
    @Json(name = "type")
    val type: ChatCompletionRequestMessageContentPartRefusal.Type,

    /* The refusal message generated by the model. */
    @Json(name = "refusal") val refusal: kotlin.String,
) {

    /**
     * The type of the content part.
     *
     * Values: refusal
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "refusal") refusal("refusal")
    }
}

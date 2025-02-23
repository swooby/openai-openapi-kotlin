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
 * Represents a chat completion response returned by model, based on the provided input.
 *
 * @param id A unique identifier for the chat completion.
 * @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
 * @param created The Unix timestamp (in seconds) of when the chat completion was created.
 * @param model The model used for the chat completion.
 * @param `object` The object type, which is always `chat.completion`.
 * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param usage 
 */


data class CreateChatCompletionFunctionResponse (

    /* A unique identifier for the chat completion. */
    @Json(name = "id")
    val id: kotlin.String,

    /* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
    @Json(name = "choices")
    val choices: kotlin.collections.List<CreateChatCompletionFunctionResponseChoicesInner>,

    /* The Unix timestamp (in seconds) of when the chat completion was created. */
    @Json(name = "created")
    val created: kotlin.Int,

    /* The model used for the chat completion. */
    @Json(name = "model")
    val model: kotlin.String,

    /* The object type, which is always `chat.completion`. */
    @Json(name = "object")
    val `object`: CreateChatCompletionFunctionResponse.`Object`,

    /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    @Json(name = "system_fingerprint")
    val systemFingerprint: kotlin.String? = null,

    @Json(name = "usage")
    val usage: CompletionUsage? = null

) {

    /**
     * The object type, which is always `chat.completion`.
     *
     * Values: chatPeriodCompletion
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "chat.completion") chatPeriodCompletion("chat.completion");
    }

}


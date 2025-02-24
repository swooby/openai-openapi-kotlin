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
 * Represents a streamed chunk of a chat completion response returned by model,
 * based on the provided input.
 *
 * @param id A unique identifier for the chat completion. Each chunk has the
 *   same ID.
 * @param choices A list of chat completion choices. Can contain more than one
 *   elements if `n` is greater than 1. Can also be empty for the last chunk if
 *   you set `stream_options: {\"include_usage\": true}`.
 * @param created The Unix timestamp (in seconds) of when the chat completion
 *   was created. Each chunk has the same timestamp.
 * @param model The model to generate the completion.
 * @param `object` The object type, which is always `chat.completion.chunk`.
 * @param serviceTier The service tier used for processing the request.
 * @param systemFingerprint This fingerprint represents the backend
 *   configuration that the model runs with. Can be used in conjunction with the
 *   `seed` request parameter to understand when backend changes have been made
 *   that might impact determinism.
 * @param usage
 */
data class CreateChatCompletionStreamResponse(

    /* A unique identifier for the chat completion. Each chunk has the same ID. */
    @Json(name = "id") val id: kotlin.String,

    /* A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`.  */
    @Json(name = "choices")
    val choices:
        kotlin.collections.List<CreateChatCompletionStreamResponseChoicesInner>,

    /* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
    @Json(name = "created") val created: kotlin.Int,

    /* The model to generate the completion. */
    @Json(name = "model") val model: kotlin.String,

    /* The object type, which is always `chat.completion.chunk`. */
    @Json(name = "object")
    val `object`: CreateChatCompletionStreamResponse.`Object`,

    /* The service tier used for processing the request. */
    @Json(name = "service_tier")
    val serviceTier: CreateChatCompletionStreamResponse.ServiceTier? = null,

    /* This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    @Json(name = "system_fingerprint")
    val systemFingerprint: kotlin.String? = null,
    @Json(name = "usage")
    val usage: CreateChatCompletionStreamResponseUsage? = null,
) {

    /**
     * The object type, which is always `chat.completion.chunk`.
     *
     * Values: chatPeriodCompletionPeriodChunk
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "chat.completion.chunk")
        chatPeriodCompletionPeriodChunk("chat.completion.chunk")
    }

    /**
     * The service tier used for processing the request.
     *
     * Values: scale,default
     */
    @JsonClass(generateAdapter = false)
    enum class ServiceTier(val value: kotlin.String) {
        @Json(name = "scale") scale("scale"),
        @Json(name = "default") default("default"),
    }
}

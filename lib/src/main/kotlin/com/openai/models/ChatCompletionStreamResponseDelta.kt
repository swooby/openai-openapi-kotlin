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
 * A chat completion delta generated by streamed model responses.
 *
 * @param content The contents of the chunk message.
 * @param functionCall 
 * @param toolCalls 
 * @param role The role of the author of this message.
 * @param refusal The refusal message generated by the model.
 */


data class ChatCompletionStreamResponseDelta (

    /* The contents of the chunk message. */
    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "function_call")
    @Deprecated(message = "This property is deprecated.")
    val functionCall: ChatCompletionStreamResponseDeltaFunctionCall? = null,

    @Json(name = "tool_calls")
    val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCallChunk>? = null,

    /* The role of the author of this message. */
    @Json(name = "role")
    val role: ChatCompletionStreamResponseDelta.Role? = null,

    /* The refusal message generated by the model. */
    @Json(name = "refusal")
    val refusal: kotlin.String? = null

) {

    /**
     * The role of the author of this message.
     *
     * Values: developer,system,user,assistant,tool
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "developer") developer("developer"),
        @Json(name = "system") system("system"),
        @Json(name = "user") user("user"),
        @Json(name = "assistant") assistant("assistant"),
        @Json(name = "tool") tool("tool");
    }

}


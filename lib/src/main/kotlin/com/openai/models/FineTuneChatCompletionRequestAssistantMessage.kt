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

import com.openai.models.ChatCompletionMessageToolCall
import com.openai.models.ChatCompletionRequestAssistantMessageAudio
import com.openai.models.ChatCompletionRequestAssistantMessageContent
import com.openai.models.ChatCompletionRequestAssistantMessageFunctionCall

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param role The role of the messages author, in this case `assistant`.
 * @param content 
 * @param refusal The refusal message by the assistant.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @param audio 
 * @param toolCalls The tool calls generated by the model, such as function calls.
 * @param functionCall 
 * @param weight Controls whether the assistant message is trained against (0 or 1)
 */


data class FineTuneChatCompletionRequestAssistantMessage (

    /* The role of the messages author, in this case `assistant`. */
    @Json(name = "role")
    val role: FineTuneChatCompletionRequestAssistantMessage.Role,

    @Json(name = "content")
    val content: ChatCompletionRequestAssistantMessageContent? = null,

    /* The refusal message by the assistant. */
    @Json(name = "refusal")
    val refusal: kotlin.String? = null,

    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "audio")
    val audio: ChatCompletionRequestAssistantMessageAudio? = null,

    /* The tool calls generated by the model, such as function calls. */
    @Json(name = "tool_calls")
    val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCall>? = null,

    @Json(name = "function_call")
    @Deprecated(message = "This property is deprecated.")
    val functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = null,

    /* Controls whether the assistant message is trained against (0 or 1) */
    @Json(name = "weight")
    val weight: FineTuneChatCompletionRequestAssistantMessage.Weight? = null

) {

    /**
     * The role of the messages author, in this case `assistant`.
     *
     * Values: assistant
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "assistant") assistant("assistant");
    }
    /**
     * Controls whether the assistant message is trained against (0 or 1)
     *
     * Values: _0,_1
     */
    @JsonClass(generateAdapter = false)
    enum class Weight(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1);
    }

}


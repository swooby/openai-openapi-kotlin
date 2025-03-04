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

/**
 * Log probability information for the choice.
 *
 * @param content A list of message content tokens with log probability
 *   information.
 * @param refusal A list of message refusal tokens with log probability
 *   information.
 */
data class CreateChatCompletionResponseChoicesInnerLogprobs(

    /* A list of message content tokens with log probability information. */
    @Json(name = "content")
    val content: kotlin.collections.List<ChatCompletionTokenLogprob>?,

    /* A list of message refusal tokens with log probability information. */
    @Json(name = "refusal")
    val refusal: kotlin.collections.List<ChatCompletionTokenLogprob>?,
) {}

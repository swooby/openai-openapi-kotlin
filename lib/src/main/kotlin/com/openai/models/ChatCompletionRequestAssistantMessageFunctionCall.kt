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
 * Deprecated and replaced by `tool_calls`. The name and arguments of a function
 * that should be called, as generated by the model.
 *
 * @param arguments The arguments to call the function with, as generated by the
 *   model in JSON format. Note that the model does not always generate valid
 *   JSON, and may hallucinate parameters not defined by your function schema.
 *   Validate the arguments in your code before calling your function.
 * @param name The name of the function to call.
 */
@Deprecated(message = "This schema is deprecated.")
data class ChatCompletionRequestAssistantMessageFunctionCall(

    /* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. */
    @Json(name = "arguments") val arguments: kotlin.String,

    /* The name of the function to call. */
    @Json(name = "name") val name: kotlin.String,
) {}

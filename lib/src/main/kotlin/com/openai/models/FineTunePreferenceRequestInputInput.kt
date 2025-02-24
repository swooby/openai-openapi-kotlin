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
 * @param messages
 * @param tools A list of tools the model may generate JSON inputs for.
 * @param parallelToolCalls Whether to enable
 *   [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling)
 *   during tool use.
 */
data class FineTunePreferenceRequestInputInput(
    @Json(name = "messages")
    val messages:
        kotlin.collections.List<FineTuneChatRequestInputMessagesInner>? =
        null,

    /* A list of tools the model may generate JSON inputs for. */
    @Json(name = "tools")
    val tools: kotlin.collections.List<ChatCompletionTool>? = null,

    /* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    @Json(name = "parallel_tool_calls")
    val parallelToolCalls: kotlin.Boolean? = true,
) {}

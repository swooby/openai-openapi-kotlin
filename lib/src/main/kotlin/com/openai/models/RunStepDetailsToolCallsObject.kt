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
 * Details of the tool call.
 *
 * @param type Always `tool_calls`.
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
 */


data class RunStepDetailsToolCallsObject (

    /* Always `tool_calls`. */
    @Json(name = "type")
    val type: RunStepDetailsToolCallsObject.Type,

    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.  */
    @Json(name = "tool_calls")
    val toolCalls: kotlin.collections.List<RunStepDetailsToolCallsObjectToolCallsInner>

) {

    /**
     * Always `tool_calls`.
     *
     * Values: tool_calls
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "tool_calls") tool_calls("tool_calls");
    }

}


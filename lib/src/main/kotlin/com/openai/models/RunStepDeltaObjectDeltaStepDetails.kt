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

import com.openai.models.RunStepDeltaStepDetailsMessageCreationObject
import com.openai.models.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
import com.openai.models.RunStepDeltaStepDetailsToolCallsObject
import com.openai.models.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The details of the run step.
 *
 * @param type Always `message_creation`.
 * @param messageCreation 
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
 */


data class RunStepDeltaObjectDeltaStepDetails (

    /* Always `message_creation`. */
    @Json(name = "type")
    val type: RunStepDeltaObjectDeltaStepDetails.Type,

    @Json(name = "message_creation")
    val messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? = null,

    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.  */
    @Json(name = "tool_calls")
    val toolCalls: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>? = null

) {

    /**
     * Always `message_creation`.
     *
     * Values: message_creation,tool_calls
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "message_creation") message_creation("message_creation"),
        @Json(name = "tool_calls") tool_calls("tool_calls");
    }

}


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

import com.openai.models.RunStepDetailsToolCallsCodeObjectCodeInterpreter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 *
 * @param id The ID of the tool call.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeInterpreter 
 */


data class RunStepDetailsToolCallsCodeObject (

    /* The ID of the tool call. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    @Json(name = "type")
    val type: RunStepDetailsToolCallsCodeObject.Type,

    @Json(name = "code_interpreter")
    val codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter

) {

    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     *
     * Values: code_interpreter
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "code_interpreter") code_interpreter("code_interpreter");
    }

}


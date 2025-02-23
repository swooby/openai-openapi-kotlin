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

/**
 * The Code Interpreter tool call definition.
 *
 * @param input The input to the Code Interpreter tool call.
 * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
 */


data class RunStepDetailsToolCallsCodeObjectCodeInterpreter (

    /* The input to the Code Interpreter tool call. */
    @Json(name = "input")
    val input: kotlin.String,

    /* The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. */
    @Json(name = "outputs")
    val outputs: kotlin.collections.List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>

) {


}


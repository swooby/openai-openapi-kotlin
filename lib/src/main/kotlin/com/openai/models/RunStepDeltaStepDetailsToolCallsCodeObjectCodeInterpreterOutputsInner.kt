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
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image
 */
data class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(

    /* The index of the output in the outputs array. */
    @Json(name = "index") val index: kotlin.Int,

    /* Always `logs`. */
    @Json(name = "type")
    val type:
        RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type,

    /* The text output from the Code Interpreter tool call. */
    @Json(name = "logs") val logs: kotlin.String? = null,
    @Json(name = "image")
    val image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? =
        null,
) {

    /**
     * Always `logs`.
     *
     * Values: logs,image
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "logs") logs("logs"),
        @Json(name = "image") image("image"),
    }
}

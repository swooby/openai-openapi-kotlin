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
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `file_search`
 *   for this type of tool call.
 * @param fileSearch For now, this is always going to be an empty object.
 * @param id The ID of the tool call object.
 */
data class RunStepDeltaStepDetailsToolCallsFileSearchObject(

    /* The index of the tool call in the tool calls array. */
    @Json(name = "index") val index: kotlin.Int,

    /* The type of tool call. This is always going to be `file_search` for this type of tool call. */
    @Json(name = "type")
    val type: RunStepDeltaStepDetailsToolCallsFileSearchObject.Type,

    /* For now, this is always going to be an empty object. */
    @Json(name = "file_search") val fileSearch: kotlin.Any,

    /* The ID of the tool call object. */
    @Json(name = "id") val id: kotlin.String? = null,
) {

    /**
     * The type of tool call. This is always going to be `file_search` for this
     * type of tool call.
     *
     * Values: file_search
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "file_search") file_search("file_search")
    }
}

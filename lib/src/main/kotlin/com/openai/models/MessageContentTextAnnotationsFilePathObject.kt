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
 * A URL for the file that's generated when the assistant used the
 * `code_interpreter` tool to generate a file.
 *
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath
 * @param startIndex
 * @param endIndex
 */
data class MessageContentTextAnnotationsFilePathObject(

    /* Always `file_path`. */
    @Json(name = "type")
    val type: MessageContentTextAnnotationsFilePathObject.Type,

    /* The text in the message content that needs to be replaced. */
    @Json(name = "text") val text: kotlin.String,
    @Json(name = "file_path")
    val filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
    @Json(name = "start_index") val startIndex: kotlin.Int,
    @Json(name = "end_index") val endIndex: kotlin.Int,
) {

    /**
     * Always `file_path`.
     *
     * Values: file_path
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "file_path") file_path("file_path")
    }
}

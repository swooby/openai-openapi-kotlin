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
 * A result instance of the file search.
 *
 * @param fileId The ID of the file that result was found in.
 * @param fileName The name of the file that result was found in.
 * @param score The score of the result. All values must be a floating point
 *   number between 0 and 1.
 * @param content The content of the result that was found. The content is only
 *   included if requested via the include query parameter.
 */
data class RunStepDetailsToolCallsFileSearchResultObject(

    /* The ID of the file that result was found in. */
    @Json(name = "file_id") val fileId: kotlin.String,

    /* The name of the file that result was found in. */
    @Json(name = "file_name") val fileName: kotlin.String,

    /* The score of the result. All values must be a floating point number between 0 and 1. */
    @Json(name = "score") val score: java.math.BigDecimal,

    /* The content of the result that was found. The content is only included if requested via the include query parameter. */
    @Json(name = "content")
    val content:
        kotlin.collections.List<
            RunStepDetailsToolCallsFileSearchResultObjectContentInner
        >? =
        null,
) {}

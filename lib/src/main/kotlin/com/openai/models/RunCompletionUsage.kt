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
 * Usage statistics related to the run. This value will be `null` if the run is
 * not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 *
 * @param completionTokens Number of completion tokens used over the course of
 *   the run.
 * @param promptTokens Number of prompt tokens used over the course of the run.
 * @param totalTokens Total number of tokens used (prompt + completion).
 */
data class RunCompletionUsage(

    /* Number of completion tokens used over the course of the run. */
    @Json(name = "completion_tokens") val completionTokens: kotlin.Int,

    /* Number of prompt tokens used over the course of the run. */
    @Json(name = "prompt_tokens") val promptTokens: kotlin.Int,

    /* Total number of tokens used (prompt + completion). */
    @Json(name = "total_tokens") val totalTokens: kotlin.Int,
) {}

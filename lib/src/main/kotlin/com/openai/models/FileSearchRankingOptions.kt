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
 * The ranking options for the file search. If not specified, the file search
 * tool will use the `auto` ranker and a score_threshold of 0. See the
 * [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings)
 * for more information.
 *
 * @param scoreThreshold The score threshold for the file search. All values
 *   must be a floating point number between 0 and 1.
 * @param ranker The ranker to use for the file search. If not specified will
 *   use the `auto` ranker.
 */
data class FileSearchRankingOptions(

    /* The score threshold for the file search. All values must be a floating point number between 0 and 1. */
    @Json(name = "score_threshold") val scoreThreshold: java.math.BigDecimal,

    /* The ranker to use for the file search. If not specified will use the `auto` ranker. */
    @Json(name = "ranker") val ranker: FileSearchRankingOptions.Ranker? = null,
) {

    /**
     * The ranker to use for the file search. If not specified will use the
     * `auto` ranker.
     *
     * Values: auto,default_2024_08_21
     */
    @JsonClass(generateAdapter = false)
    enum class Ranker(val value: kotlin.String) {
        @Json(name = "auto") auto("auto"),
        @Json(name = "default_2024_08_21")
        default_2024_08_21("default_2024_08_21"),
    }
}

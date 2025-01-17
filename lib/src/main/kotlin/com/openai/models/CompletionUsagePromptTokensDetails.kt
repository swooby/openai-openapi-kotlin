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
 * Breakdown of tokens used in the prompt.
 *
 * @param audioTokens Audio input tokens present in the prompt.
 * @param cachedTokens Cached tokens present in the prompt.
 */


data class CompletionUsagePromptTokensDetails (

    /* Audio input tokens present in the prompt. */
    @Json(name = "audio_tokens")
    val audioTokens: kotlin.Int? = null,

    /* Cached tokens present in the prompt. */
    @Json(name = "cached_tokens")
    val cachedTokens: kotlin.Int? = null

) {


}


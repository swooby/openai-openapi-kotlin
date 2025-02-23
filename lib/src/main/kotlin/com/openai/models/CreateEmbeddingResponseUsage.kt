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
 * The usage information for the request.
 *
 * @param promptTokens The number of tokens used by the prompt.
 * @param totalTokens The total number of tokens used by the request.
 */


data class CreateEmbeddingResponseUsage (

    /* The number of tokens used by the prompt. */
    @Json(name = "prompt_tokens")
    val promptTokens: kotlin.Int,

    /* The total number of tokens used by the request. */
    @Json(name = "total_tokens")
    val totalTokens: kotlin.Int

) {


}


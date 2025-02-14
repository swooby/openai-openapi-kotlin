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
 * Breakdown of tokens used in a completion.
 *
 * @param acceptedPredictionTokens When using Predicted Outputs, the number of tokens in the prediction that appeared in the completion. 
 * @param audioTokens Audio input tokens generated by the model.
 * @param reasoningTokens Tokens generated by the model for reasoning.
 * @param rejectedPredictionTokens When using Predicted Outputs, the number of tokens in the prediction that did not appear in the completion. However, like reasoning tokens, these tokens are still counted in the total completion tokens for purposes of billing, output, and context window limits. 
 */


data class CompletionUsageCompletionTokensDetails (

    /* When using Predicted Outputs, the number of tokens in the prediction that appeared in the completion.  */
    @Json(name = "accepted_prediction_tokens")
    val acceptedPredictionTokens: kotlin.Int? = null,

    /* Audio input tokens generated by the model. */
    @Json(name = "audio_tokens")
    val audioTokens: kotlin.Int? = null,

    /* Tokens generated by the model for reasoning. */
    @Json(name = "reasoning_tokens")
    val reasoningTokens: kotlin.Int? = null,

    /* When using Predicted Outputs, the number of tokens in the prediction that did not appear in the completion. However, like reasoning tokens, these tokens are still counted in the total completion tokens for purposes of billing, output, and context window limits.  */
    @Json(name = "rejected_prediction_tokens")
    val rejectedPredictionTokens: kotlin.Int? = null

) {


}


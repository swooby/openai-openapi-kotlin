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
 * The aggregated embeddings usage details of the specific time bucket.
 *
 * @param `object` 
 * @param inputTokens The aggregated number of input tokens used.
 * @param numModelRequests The count of requests made to the model.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 */


data class UsageEmbeddingsResult (

    @Json(name = "object")
    val `object`: UsageEmbeddingsResult.`Object`,

    /* The aggregated number of input tokens used. */
    @Json(name = "input_tokens")
    val inputTokens: kotlin.Int,

    /* The count of requests made to the model. */
    @Json(name = "num_model_requests")
    val numModelRequests: kotlin.Int,

    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    @Json(name = "project_id")
    val projectId: kotlin.String? = null,

    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    @Json(name = "api_key_id")
    val apiKeyId: kotlin.String? = null,

    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    @Json(name = "model")
    val model: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: organizationPeriodUsagePeriodEmbeddingsPeriodResult
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.usage.embeddings.result") organizationPeriodUsagePeriodEmbeddingsPeriodResult("organization.usage.embeddings.result");
    }

}


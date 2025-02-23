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
 * 
 *
 * @param `object` 
 * @param inputTokens The aggregated number of input tokens used.
 * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param numModelRequests The count of requests made to the model.
 * @param images The number of images processed.
 * @param characters The number of characters processed.
 * @param seconds The number of seconds processed.
 * @param usageBytes The vector stores usage in bytes.
 * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens.
 * @param outputAudioTokens The aggregated number of audio output tokens used.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
 * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
 * @param propertySize When `group_by=size`, this field provides the image size of the grouped usage result.
 * @param numSessions The number of code interpreter sessions.
 * @param amount 
 * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result.
 */


data class UsageTimeBucketResultInner (

    @Json(name = "object")
    val `object`: UsageTimeBucketResultInner.`Object`,

    /* The aggregated number of input tokens used. */
    @Json(name = "input_tokens")
    val inputTokens: kotlin.Int,

    /* The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. */
    @Json(name = "output_tokens")
    val outputTokens: kotlin.Int,

    /* The count of requests made to the model. */
    @Json(name = "num_model_requests")
    val numModelRequests: kotlin.Int,

    /* The number of images processed. */
    @Json(name = "images")
    val images: kotlin.Int,

    /* The number of characters processed. */
    @Json(name = "characters")
    val characters: kotlin.Int,

    /* The number of seconds processed. */
    @Json(name = "seconds")
    val seconds: kotlin.Int,

    /* The vector stores usage in bytes. */
    @Json(name = "usage_bytes")
    val usageBytes: kotlin.Int,

    /* The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. */
    @Json(name = "input_cached_tokens")
    val inputCachedTokens: kotlin.Int? = null,

    /* The aggregated number of audio input tokens used, including cached tokens. */
    @Json(name = "input_audio_tokens")
    val inputAudioTokens: kotlin.Int? = null,

    /* The aggregated number of audio output tokens used. */
    @Json(name = "output_audio_tokens")
    val outputAudioTokens: kotlin.Int? = null,

    /* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
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
    val model: kotlin.String? = null,

    /* When `group_by=batch`, this field tells whether the grouped usage result is batch or not. */
    @Json(name = "batch")
    val batch: kotlin.Boolean? = null,

    /* When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. */
    @Json(name = "source")
    val source: kotlin.String? = null,

    /* When `group_by=size`, this field provides the image size of the grouped usage result. */
    @Json(name = "size")
    val propertySize: kotlin.String? = null,

    /* The number of code interpreter sessions. */
    @Json(name = "num_sessions")
    val numSessions: kotlin.Int? = null,

    @Json(name = "amount")
    val amount: CostsResultAmount? = null,

    /* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
    @Json(name = "line_item")
    val lineItem: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: organizationPeriodCostsPeriodResult
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.costs.result") organizationPeriodCostsPeriodResult("organization.costs.result");
    }

}


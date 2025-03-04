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
 * The aggregated completions usage details of the specific time bucket.
 *
 * @param `object`
 * @param inputTokens The aggregated number of text input tokens used, including
 *   cached tokens. For customers subscribe to scale tier, this includes scale
 *   tier tokens.
 * @param outputTokens The aggregated number of text output tokens used. For
 *   customers subscribe to scale tier, this includes scale tier tokens.
 * @param numModelRequests The count of requests made to the model.
 * @param inputCachedTokens The aggregated number of text input tokens that has
 *   been cached from previous requests. For customers subscribe to scale tier,
 *   this includes scale tier tokens.
 * @param inputAudioTokens The aggregated number of audio input tokens used,
 *   including cached tokens.
 * @param outputAudioTokens The aggregated number of audio output tokens used.
 * @param projectId When `group_by=project_id`, this field provides the project
 *   ID of the grouped usage result.
 * @param userId When `group_by=user_id`, this field provides the user ID of the
 *   grouped usage result.
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key
 *   ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the
 *   grouped usage result.
 * @param batch When `group_by=batch`, this field tells whether the grouped
 *   usage result is batch or not.
 */
data class UsageCompletionsResult(
    @Json(name = "object") val `object`: UsageCompletionsResult.`Object`,

    /* The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. */
    @Json(name = "input_tokens") val inputTokens: kotlin.Int,

    /* The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. */
    @Json(name = "output_tokens") val outputTokens: kotlin.Int,

    /* The count of requests made to the model. */
    @Json(name = "num_model_requests") val numModelRequests: kotlin.Int,

    /* The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. */
    @Json(name = "input_cached_tokens")
    val inputCachedTokens: kotlin.Int? = null,

    /* The aggregated number of audio input tokens used, including cached tokens. */
    @Json(name = "input_audio_tokens") val inputAudioTokens: kotlin.Int? = null,

    /* The aggregated number of audio output tokens used. */
    @Json(name = "output_audio_tokens")
    val outputAudioTokens: kotlin.Int? = null,

    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    @Json(name = "project_id") val projectId: kotlin.String? = null,

    /* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
    @Json(name = "user_id") val userId: kotlin.String? = null,

    /* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
    @Json(name = "api_key_id") val apiKeyId: kotlin.String? = null,

    /* When `group_by=model`, this field provides the model name of the grouped usage result. */
    @Json(name = "model") val model: kotlin.String? = null,

    /* When `group_by=batch`, this field tells whether the grouped usage result is batch or not. */
    @Json(name = "batch") val batch: kotlin.Boolean? = null,
) {

    /** Values: organizationPeriodUsagePeriodCompletionsPeriodResult */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.usage.completions.result")
        organizationPeriodUsagePeriodCompletionsPeriodResult(
            "organization.usage.completions.result"
        )
    }
}

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
 * The payload used to update the rate limits.
 *
 * @param maxRequestsPer1Minute The maximum requests per minute.
 * @param maxTokensPer1Minute The maximum tokens per minute.
 * @param maxImagesPer1Minute The maximum images per minute. Only relevant for
 *   certain models.
 * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute.
 *   Only relevant for certain models.
 * @param maxRequestsPer1Day The maximum requests per day. Only relevant for
 *   certain models.
 * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only
 *   relevant for certain models.
 */
data class AuditLogRateLimitUpdatedChangesRequested(

    /* The maximum requests per minute. */
    @Json(name = "max_requests_per_1_minute")
    val maxRequestsPer1Minute: kotlin.Int? = null,

    /* The maximum tokens per minute. */
    @Json(name = "max_tokens_per_1_minute")
    val maxTokensPer1Minute: kotlin.Int? = null,

    /* The maximum images per minute. Only relevant for certain models. */
    @Json(name = "max_images_per_1_minute")
    val maxImagesPer1Minute: kotlin.Int? = null,

    /* The maximum audio megabytes per minute. Only relevant for certain models. */
    @Json(name = "max_audio_megabytes_per_1_minute")
    val maxAudioMegabytesPer1Minute: kotlin.Int? = null,

    /* The maximum requests per day. Only relevant for certain models. */
    @Json(name = "max_requests_per_1_day")
    val maxRequestsPer1Day: kotlin.Int? = null,

    /* The maximum batch input tokens per day. Only relevant for certain models. */
    @Json(name = "batch_1_day_max_input_tokens")
    val batch1DayMaxInputTokens: kotlin.Int? = null,
) {}

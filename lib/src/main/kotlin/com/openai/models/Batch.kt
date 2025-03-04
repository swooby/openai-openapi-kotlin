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
 * @param id
 * @param `object` The object type, which is always `batch`.
 * @param endpoint The OpenAI API endpoint used by the batch.
 * @param inputFileId The ID of the input file for the batch.
 * @param completionWindow The time frame within which the batch should be
 *   processed.
 * @param status The current status of the batch.
 * @param createdAt The Unix timestamp (in seconds) for when the batch was
 *   created.
 * @param errors
 * @param outputFileId The ID of the file containing the outputs of successfully
 *   executed requests.
 * @param errorFileId The ID of the file containing the outputs of requests with
 *   errors.
 * @param inProgressAt The Unix timestamp (in seconds) for when the batch
 *   started processing.
 * @param expiresAt The Unix timestamp (in seconds) for when the batch will
 *   expire.
 * @param finalizingAt The Unix timestamp (in seconds) for when the batch
 *   started finalizing.
 * @param completedAt The Unix timestamp (in seconds) for when the batch was
 *   completed.
 * @param failedAt The Unix timestamp (in seconds) for when the batch failed.
 * @param expiredAt The Unix timestamp (in seconds) for when the batch expired.
 * @param cancellingAt The Unix timestamp (in seconds) for when the batch
 *   started cancelling.
 * @param cancelledAt The Unix timestamp (in seconds) for when the batch was
 *   cancelled.
 * @param requestCounts
 * @param metadata Set of 16 key-value pairs that can be attached to an object.
 *   This can be useful for storing additional information about the object in a
 *   structured format, and querying for objects via API or the dashboard. Keys
 *   are strings with a maximum length of 64 characters. Values are strings with
 *   a maximum length of 512 characters.
 */
data class Batch(
    @Json(name = "id") val id: kotlin.String,

    /* The object type, which is always `batch`. */
    @Json(name = "object") val `object`: Batch.`Object`,

    /* The OpenAI API endpoint used by the batch. */
    @Json(name = "endpoint") val endpoint: kotlin.String,

    /* The ID of the input file for the batch. */
    @Json(name = "input_file_id") val inputFileId: kotlin.String,

    /* The time frame within which the batch should be processed. */
    @Json(name = "completion_window") val completionWindow: kotlin.String,

    /* The current status of the batch. */
    @Json(name = "status") val status: Batch.Status,

    /* The Unix timestamp (in seconds) for when the batch was created. */
    @Json(name = "created_at") val createdAt: kotlin.Int,
    @Json(name = "errors") val errors: BatchErrors? = null,

    /* The ID of the file containing the outputs of successfully executed requests. */
    @Json(name = "output_file_id") val outputFileId: kotlin.String? = null,

    /* The ID of the file containing the outputs of requests with errors. */
    @Json(name = "error_file_id") val errorFileId: kotlin.String? = null,

    /* The Unix timestamp (in seconds) for when the batch started processing. */
    @Json(name = "in_progress_at") val inProgressAt: kotlin.Int? = null,

    /* The Unix timestamp (in seconds) for when the batch will expire. */
    @Json(name = "expires_at") val expiresAt: kotlin.Int? = null,

    /* The Unix timestamp (in seconds) for when the batch started finalizing. */
    @Json(name = "finalizing_at") val finalizingAt: kotlin.Int? = null,

    /* The Unix timestamp (in seconds) for when the batch was completed. */
    @Json(name = "completed_at") val completedAt: kotlin.Int? = null,

    /* The Unix timestamp (in seconds) for when the batch failed. */
    @Json(name = "failed_at") val failedAt: kotlin.Int? = null,

    /* The Unix timestamp (in seconds) for when the batch expired. */
    @Json(name = "expired_at") val expiredAt: kotlin.Int? = null,

    /* The Unix timestamp (in seconds) for when the batch started cancelling. */
    @Json(name = "cancelling_at") val cancellingAt: kotlin.Int? = null,

    /* The Unix timestamp (in seconds) for when the batch was cancelled. */
    @Json(name = "cancelled_at") val cancelledAt: kotlin.Int? = null,
    @Json(name = "request_counts")
    val requestCounts: BatchRequestCounts? = null,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
) {

    /**
     * The object type, which is always `batch`.
     *
     * Values: batch
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "batch") batch("batch")
    }

    /**
     * The current status of the batch.
     *
     * Values:
     * validating,failed,in_progress,finalizing,completed,expired,cancelling,cancelled
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "validating") validating("validating"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "in_progress") in_progress("in_progress"),
        @Json(name = "finalizing") finalizing("finalizing"),
        @Json(name = "completed") completed("completed"),
        @Json(name = "expired") expired("expired"),
        @Json(name = "cancelling") cancelling("cancelling"),
        @Json(name = "cancelled") cancelled("cancelled"),
    }
}

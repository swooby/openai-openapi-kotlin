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
 * Fine-tuning job event object
 *
 * @param `object` The object type, which is always \"fine_tuning.job.event\".
 * @param id The object identifier.
 * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job
 *   was created.
 * @param level The log level of the event.
 * @param message The message of the event.
 * @param type The type of event.
 * @param `data` The data associated with the event.
 */
data class FineTuningJobEvent(

    /* The object type, which is always \"fine_tuning.job.event\". */
    @Json(name = "object") val `object`: FineTuningJobEvent.`Object`,

    /* The object identifier. */
    @Json(name = "id") val id: kotlin.String,

    /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    @Json(name = "created_at") val createdAt: kotlin.Int,

    /* The log level of the event. */
    @Json(name = "level") val level: FineTuningJobEvent.Level,

    /* The message of the event. */
    @Json(name = "message") val message: kotlin.String,

    /* The type of event. */
    @Json(name = "type") val type: FineTuningJobEvent.Type? = null,

    /* The data associated with the event. */
    @Json(name = "data") val `data`: kotlin.Any? = null,
) {

    /**
     * The object type, which is always \"fine_tuning.job.event\".
     *
     * Values: fine_tuningPeriodJobPeriodEvent
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "fine_tuning.job.event")
        fine_tuningPeriodJobPeriodEvent("fine_tuning.job.event")
    }

    /**
     * The log level of the event.
     *
     * Values: info,warn,error
     */
    @JsonClass(generateAdapter = false)
    enum class Level(val value: kotlin.String) {
        @Json(name = "info") info("info"),
        @Json(name = "warn") warn("warn"),
        @Json(name = "error") error("error"),
    }

    /**
     * The type of event.
     *
     * Values: message,metrics
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "message") message("message"),
        @Json(name = "metrics") metrics("metrics"),
    }
}

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
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 *
 * @param event
 * @param `data`
 */
data class RunStreamEventOneOf6(
    @Json(name = "event") val event: RunStreamEventOneOf6.Event,
    @Json(name = "data") val `data`: RunObject,
) {

    /** Values: threadPeriodRunPeriodFailed */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.run.failed")
        threadPeriodRunPeriodFailed("thread.run.failed")
    }
}

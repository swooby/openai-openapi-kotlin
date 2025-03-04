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
 * @param event
 * @param `data`
 */
data class MessageStreamEvent(
    @Json(name = "event") val event: MessageStreamEvent.Event,
    @Json(name = "data") val `data`: MessageObject,
) {

    /** Values: threadPeriodMessagePeriodIncomplete */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.message.incomplete")
        threadPeriodMessagePeriodIncomplete("thread.message.incomplete")
    }
}

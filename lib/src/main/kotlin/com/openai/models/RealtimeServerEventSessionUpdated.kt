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
 * Returned when a session is updated with a `session.update` event, unless
 * there is an error.
 *
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `session.updated`.
 * @param session
 */
data class RealtimeServerEventSessionUpdated(

    /* The unique ID of the server event. */
    @Json(name = "event_id") val eventId: kotlin.String,

    /* The event type, must be `session.updated`. */
    @Json(name = "type") val type: RealtimeServerEventSessionUpdated.Type,
    @Json(name = "session") val session: RealtimeSession,
) {

    /**
     * The event type, must be `session.updated`.
     *
     * Values: sessionPeriodUpdated
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "session.updated") sessionPeriodUpdated("session.updated")
    }
}

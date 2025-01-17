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
 * Returned when the model-generated audio is updated.
 *
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.audio.delta`.
 * @param responseId The ID of the response.
 * @param itemId The ID of the item.
 * @param outputIndex The index of the output item in the response.
 * @param contentIndex The index of the content part in the item's content array.
 * @param delta Base64-encoded audio data delta.
 */


data class RealtimeServerEventResponseAudioDelta (

    /* The unique ID of the server event. */
    @Json(name = "event_id")
    val eventId: kotlin.String,

    /* The event type, must be `response.audio.delta`. */
    @Json(name = "type")
    val type: RealtimeServerEventResponseAudioDelta.Type,

    /* The ID of the response. */
    @Json(name = "response_id")
    val responseId: kotlin.String,

    /* The ID of the item. */
    @Json(name = "item_id")
    val itemId: kotlin.String,

    /* The index of the output item in the response. */
    @Json(name = "output_index")
    val outputIndex: kotlin.Int,

    /* The index of the content part in the item's content array. */
    @Json(name = "content_index")
    val contentIndex: kotlin.Int,

    /* Base64-encoded audio data delta. */
    @Json(name = "delta")
    val delta: kotlin.String

) {

    /**
     * The event type, must be `response.audio.delta`.
     *
     * Values: responsePeriodAudioPeriodDelta
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "response.audio.delta") responsePeriodAudioPeriodDelta("response.audio.delta");
    }

}


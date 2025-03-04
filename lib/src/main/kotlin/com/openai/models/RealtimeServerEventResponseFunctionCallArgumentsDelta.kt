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
 * Returned when the model-generated function call arguments are updated.
 *
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.function_call_arguments.delta`.
 * @param responseId The ID of the response.
 * @param itemId The ID of the function call item.
 * @param outputIndex The index of the output item in the response.
 * @param callId The ID of the function call.
 * @param delta The arguments delta as a JSON string.
 */
data class RealtimeServerEventResponseFunctionCallArgumentsDelta(

    /* The unique ID of the server event. */
    @Json(name = "event_id") val eventId: kotlin.String,

    /* The event type, must be `response.function_call_arguments.delta`.  */
    @Json(name = "type")
    val type: RealtimeServerEventResponseFunctionCallArgumentsDelta.Type,

    /* The ID of the response. */
    @Json(name = "response_id") val responseId: kotlin.String,

    /* The ID of the function call item. */
    @Json(name = "item_id") val itemId: kotlin.String,

    /* The index of the output item in the response. */
    @Json(name = "output_index") val outputIndex: kotlin.Int,

    /* The ID of the function call. */
    @Json(name = "call_id") val callId: kotlin.String,

    /* The arguments delta as a JSON string. */
    @Json(name = "delta") val delta: kotlin.String,
) {

    /**
     * The event type, must be `response.function_call_arguments.delta`.
     *
     * Values: responsePeriodFunction_call_argumentsPeriodDelta
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "response.function_call_arguments.delta")
        responsePeriodFunction_call_argumentsPeriodDelta(
            "response.function_call_arguments.delta"
        )
    }
}

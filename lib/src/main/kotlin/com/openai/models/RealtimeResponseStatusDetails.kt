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
 * Additional details about the status.
 *
 * @param type The type of error that caused the response to fail, corresponding
 *   with the `status` field (`completed`, `cancelled`, `incomplete`, `failed`).
 * @param reason The reason the Response did not complete. For a `cancelled`
 *   Response, one of `turn_detected` (the server VAD detected a new start of
 *   speech) or `client_cancelled` (the client sent a cancel event). For an
 *   `incomplete` Response, one of `max_output_tokens` or `content_filter` (the
 *   server-side safety filter activated and cut off the response).
 * @param error
 */
data class RealtimeResponseStatusDetails(

    /* The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).  */
    @Json(name = "type") val type: RealtimeResponseStatusDetails.Type? = null,

    /* The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).  */
    @Json(name = "reason")
    val reason: RealtimeResponseStatusDetails.Reason? = null,
    @Json(name = "error") val error: RealtimeResponseStatusDetailsError? = null,
) {

    /**
     * The type of error that caused the response to fail, corresponding with
     * the `status` field (`completed`, `cancelled`, `incomplete`, `failed`).
     *
     * Values: completed,cancelled,failed,incomplete
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "completed") completed("completed"),
        @Json(name = "cancelled") cancelled("cancelled"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "incomplete") incomplete("incomplete"),
    }

    /**
     * The reason the Response did not complete. For a `cancelled` Response, one
     * of `turn_detected` (the server VAD detected a new start of speech) or
     * `client_cancelled` (the client sent a cancel event). For an `incomplete`
     * Response, one of `max_output_tokens` or `content_filter` (the server-side
     * safety filter activated and cut off the response).
     *
     * Values: turn_detected,client_cancelled,max_output_tokens,content_filter
     */
    @JsonClass(generateAdapter = false)
    enum class Reason(val value: kotlin.String) {
        @Json(name = "turn_detected") turn_detected("turn_detected"),
        @Json(name = "client_cancelled") client_cancelled("client_cancelled"),
        @Json(name = "max_output_tokens")
        max_output_tokens("max_output_tokens"),
        @Json(name = "content_filter") content_filter("content_filter"),
    }
}

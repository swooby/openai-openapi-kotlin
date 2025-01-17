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
 * Details of the error.
 *
 * @param type The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
 * @param message A human-readable error message.
 * @param code Error code, if any.
 * @param `param` Parameter related to the error, if any.
 * @param eventId The event_id of the client event that caused the error, if applicable. 
 */


data class RealtimeServerEventErrorError (

    /* The type of error (e.g., \"invalid_request_error\", \"server_error\").  */
    @Json(name = "type")
    val type: kotlin.String,

    /* A human-readable error message. */
    @Json(name = "message")
    val message: kotlin.String,

    /* Error code, if any. */
    @Json(name = "code")
    val code: kotlin.String? = null,

    /* Parameter related to the error, if any. */
    @Json(name = "param")
    val `param`: kotlin.String? = null,

    /* The event_id of the client event that caused the error, if applicable.  */
    @Json(name = "event_id")
    val eventId: kotlin.String? = null

) {


}

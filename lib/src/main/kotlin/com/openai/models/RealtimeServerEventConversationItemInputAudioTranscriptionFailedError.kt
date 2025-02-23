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

/**
 * Details of the transcription error.
 *
 * @param type The type of error.
 * @param code Error code, if any.
 * @param message A human-readable error message.
 * @param `param` Parameter related to the error, if any.
 */


data class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError (

    /* The type of error. */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* Error code, if any. */
    @Json(name = "code")
    val code: kotlin.String? = null,

    /* A human-readable error message. */
    @Json(name = "message")
    val message: kotlin.String? = null,

    /* Parameter related to the error, if any. */
    @Json(name = "param")
    val `param`: kotlin.String? = null

) {


}


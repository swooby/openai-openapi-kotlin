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
 * If the audio output modality is requested, this object contains data about the audio response from the model. [Learn more](/docs/guides/audio). 
 *
 * @param id Unique identifier for this audio response.
 * @param expiresAt The Unix timestamp (in seconds) for when this audio response will no longer be accessible on the server for use in multi-turn conversations. 
 * @param `data` Base64 encoded audio bytes generated by the model, in the format specified in the request. 
 * @param transcript Transcript of the audio generated by the model.
 */


data class ChatCompletionResponseMessageAudio (

    /* Unique identifier for this audio response. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The Unix timestamp (in seconds) for when this audio response will no longer be accessible on the server for use in multi-turn conversations.  */
    @Json(name = "expires_at")
    val expiresAt: kotlin.Int,

    /* Base64 encoded audio bytes generated by the model, in the format specified in the request.  */
    @Json(name = "data")
    val `data`: kotlin.String,

    /* Transcript of the audio generated by the model. */
    @Json(name = "transcript")
    val transcript: kotlin.String

) {


}

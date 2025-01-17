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
 * 
 *
 * @param type The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
 * @param text The text content, used for `input_text` and `text` content types. 
 * @param id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
 * @param audio Base64-encoded audio bytes, used for `input_audio` content type. 
 * @param transcript The transcript of the audio, used for `input_audio` content type. 
 */


data class RealtimeConversationItemContentInner (

    /* The content type (`input_text`, `input_audio`, `item_reference`, `text`).  */
    @Json(name = "type")
    val type: RealtimeConversationItemContentInner.Type? = null,

    /* The text content, used for `input_text` and `text` content types.  */
    @Json(name = "text")
    val text: kotlin.String? = null,

    /* ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Base64-encoded audio bytes, used for `input_audio` content type.  */
    @Json(name = "audio")
    val audio: kotlin.String? = null,

    /* The transcript of the audio, used for `input_audio` content type.  */
    @Json(name = "transcript")
    val transcript: kotlin.String? = null

) {

    /**
     * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
     *
     * Values: input_audio,input_text,item_reference,text
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "input_audio") input_audio("input_audio"),
        @Json(name = "input_text") input_text("input_text"),
        @Json(name = "item_reference") item_reference("item_reference"),
        @Json(name = "text") text("text");
    }

}


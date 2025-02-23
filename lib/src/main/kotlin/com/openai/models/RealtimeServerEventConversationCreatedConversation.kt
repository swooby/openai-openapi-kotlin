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
 * The conversation resource.
 *
 * @param id The unique ID of the conversation.
 * @param `object` The object type, must be `realtime.conversation`.
 */


data class RealtimeServerEventConversationCreatedConversation (

    /* The unique ID of the conversation. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The object type, must be `realtime.conversation`. */
    @Json(name = "object")
    val `object`: kotlin.String? = null

) {


}


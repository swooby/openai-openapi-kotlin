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

import com.openai.models.CreateMessageRequestAttachmentsInner
import com.openai.models.CreateMessageRequestContent

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param role The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
 * @param content 
 * @param attachments A list of files attached to the message, and the tools they should be added to.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */


data class CreateMessageRequest (

    /* The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  */
    @Json(name = "role")
    val role: CreateMessageRequest.Role,

    @Json(name = "content")
    val content: CreateMessageRequestContent,

    /* A list of files attached to the message, and the tools they should be added to. */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<CreateMessageRequestAttachmentsInner>? = null,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    @Json(name = "metadata")
    val metadata: kotlin.Any? = null

) {

    /**
     * The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
     *
     * Values: user,assistant
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "user") user("user"),
        @Json(name = "assistant") assistant("assistant");
    }

}

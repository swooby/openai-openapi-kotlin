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

import com.openai.models.ChatCompletionRequestUserMessageContent

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Messages sent by an end user, containing prompts or additional context information. 
 *
 * @param content 
 * @param role The role of the messages author, in this case `user`.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 */


data class ChatCompletionRequestUserMessage (

    @Json(name = "content")
    val content: ChatCompletionRequestUserMessageContent,

    /* The role of the messages author, in this case `user`. */
    @Json(name = "role")
    val role: ChatCompletionRequestUserMessage.Role,

    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    @Json(name = "name")
    val name: kotlin.String? = null

) {

    /**
     * The role of the messages author, in this case `user`.
     *
     * Values: user
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "user") user("user");
    }

}

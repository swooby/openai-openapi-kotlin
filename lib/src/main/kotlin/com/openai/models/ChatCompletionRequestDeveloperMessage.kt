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
 * Developer-provided instructions that the model should follow, regardless of
 * messages sent by the user. With o1 models and newer, `developer` messages
 * replace the previous `system` messages.
 *
 * @param content
 * @param role The role of the messages author, in this case `developer`.
 * @param name An optional name for the participant. Provides the model
 *   information to differentiate between participants of the same role.
 */
data class ChatCompletionRequestDeveloperMessage(
    @Json(name = "content")
    val content: ChatCompletionRequestDeveloperMessageContent,

    /* The role of the messages author, in this case `developer`. */
    @Json(name = "role") val role: ChatCompletionRequestDeveloperMessage.Role,

    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    @Json(name = "name") val name: kotlin.String? = null,
) {

    /**
     * The role of the messages author, in this case `developer`.
     *
     * Values: developer
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "developer") developer("developer")
    }
}

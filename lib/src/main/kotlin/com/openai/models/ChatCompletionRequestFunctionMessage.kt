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
 * @param role The role of the messages author, in this case `function`.
 * @param content The contents of the function message.
 * @param name The name of the function to call.
 */

@Deprecated(message = "This schema is deprecated.")

data class ChatCompletionRequestFunctionMessage (

    /* The role of the messages author, in this case `function`. */
    @Json(name = "role")
    val role: ChatCompletionRequestFunctionMessage.Role,

    /* The contents of the function message. */
    @Json(name = "content")
    val content: kotlin.String?,

    /* The name of the function to call. */
    @Json(name = "name")
    val name: kotlin.String

) {

    /**
     * The role of the messages author, in this case `function`.
     *
     * Values: function
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "function") function("function");
    }

}

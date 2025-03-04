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
 * The role of the author of a message
 *
 * Values: developer,system,user,assistant,tool,function
 */
@JsonClass(generateAdapter = false)
enum class ChatCompletionRole(val value: kotlin.String) {

    @Json(name = "developer") developer("developer"),
    @Json(name = "system") system("system"),
    @Json(name = "user") user("user"),
    @Json(name = "assistant") assistant("assistant"),
    @Json(name = "tool") tool("tool"),
    @Json(name = "function") function("function");

    /**
     * Override [toString()] to avoid using the enum variable name as the value,
     * and instead use the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different,
     * and ensures that the client sends the correct enum values to the server
     * always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null
         * otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? =
            if (data is ChatCompletionRole) "$data" else null

        /** Returns a valid [ChatCompletionRole] for [data], null otherwise. */
        fun decode(data: kotlin.Any?): ChatCompletionRole? =
            data?.let {
                val normalizedData = "$it".lowercase()
                values().firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}

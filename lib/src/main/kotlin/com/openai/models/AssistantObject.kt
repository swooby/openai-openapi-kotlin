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
 * Represents an `assistant` that can call the model and use tools.
 *
 * @param id The identifier, which can be referenced in API endpoints.
 * @param `object` The object type, which is always `assistant`.
 * @param createdAt The Unix timestamp (in seconds) for when the assistant was
 *   created.
 * @param name The name of the assistant. The maximum length is 256 characters.
 * @param description The description of the assistant. The maximum length is
 *   512 characters.
 * @param model ID of the model to use. You can use the
 *   [List models](/docs/api-reference/models/list) API to see all of your
 *   available models, or see our [Model overview](/docs/models) for
 *   descriptions of them.
 * @param instructions The system instructions that the assistant uses. The
 *   maximum length is 256,000 characters.
 * @param tools A list of tool enabled on the assistant. There can be a maximum
 *   of 128 tools per assistant. Tools can be of types `code_interpreter`,
 *   `file_search`, or `function`.
 * @param metadata Set of 16 key-value pairs that can be attached to an object.
 *   This can be useful for storing additional information about the object in a
 *   structured format, and querying for objects via API or the dashboard. Keys
 *   are strings with a maximum length of 64 characters. Values are strings with
 *   a maximum length of 512 characters.
 * @param toolResources
 * @param temperature What sampling temperature to use, between 0 and 2. Higher
 *   values like 0.8 will make the output more random, while lower values like
 *   0.2 will make it more focused and deterministic.
 * @param topP An alternative to sampling with temperature, called nucleus
 *   sampling, where the model considers the results of the tokens with top_p
 *   probability mass. So 0.1 means only the tokens comprising the top 10%
 *   probability mass are considered. We generally recommend altering this or
 *   temperature but not both.
 * @param responseFormat
 */
data class AssistantObject(

    /* The identifier, which can be referenced in API endpoints. */
    @Json(name = "id") val id: kotlin.String,

    /* The object type, which is always `assistant`. */
    @Json(name = "object") val `object`: AssistantObject.`Object`,

    /* The Unix timestamp (in seconds) for when the assistant was created. */
    @Json(name = "created_at") val createdAt: kotlin.Int,

    /* The name of the assistant. The maximum length is 256 characters.  */
    @Json(name = "name") val name: kotlin.String?,

    /* The description of the assistant. The maximum length is 512 characters.  */
    @Json(name = "description") val description: kotlin.String?,

    /* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  */
    @Json(name = "model") val model: kotlin.String,

    /* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    @Json(name = "instructions") val instructions: kotlin.String?,

    /* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  */
    @Json(name = "tools")
    val tools: kotlin.collections.List<AssistantObjectToolsInner> =
        arrayListOf(),

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>?,
    @Json(name = "tool_resources")
    val toolResources: AssistantObjectToolResources? = null,

    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    @Json(name = "temperature")
    val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
    @Json(name = "top_p")
    val topP: java.math.BigDecimal? = java.math.BigDecimal("1"),
    @Json(name = "response_format")
    val responseFormat: AssistantObjectResponseFormat? = null,
) {

    /**
     * The object type, which is always `assistant`.
     *
     * Values: assistant
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "assistant") assistant("assistant")
    }
}

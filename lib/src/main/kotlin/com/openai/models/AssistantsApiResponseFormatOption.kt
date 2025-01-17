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

import com.openai.models.ResponseFormatJsonObject
import com.openai.models.ResponseFormatJsonSchema
import com.openai.models.ResponseFormatJsonSchemaJsonSchema
import com.openai.models.ResponseFormatText

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 *
 * @param type The type of response format being defined: `text`
 * @param jsonSchema 
 */


data class AssistantsApiResponseFormatOption (

    /* The type of response format being defined: `text` */
    @Json(name = "type")
    val type: AssistantsApiResponseFormatOption.Type,

    @Json(name = "json_schema")
    val jsonSchema: ResponseFormatJsonSchemaJsonSchema

) {

    /**
     * The type of response format being defined: `text`
     *
     * Values: text,json_object,json_schema
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "text") text("text"),
        @Json(name = "json_object") json_object("json_object"),
        @Json(name = "json_schema") json_schema("json_schema");
    }

}


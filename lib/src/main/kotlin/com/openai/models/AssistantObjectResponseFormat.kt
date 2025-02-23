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
 * @param type The type of response format being defined: `json_schema`
 * @param jsonSchema 
 */


data class AssistantObjectResponseFormat (

    /* The type of response format being defined: `json_schema` */
    @Json(name = "type")
    val type: AssistantObjectResponseFormat.Type,

    @Json(name = "json_schema")
    val jsonSchema: ResponseFormatJsonSchemaJsonSchema

) {

    /**
     * The type of response format being defined: `json_schema`
     *
     * Values: json_schema
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "json_schema") json_schema("json_schema");
    }

}


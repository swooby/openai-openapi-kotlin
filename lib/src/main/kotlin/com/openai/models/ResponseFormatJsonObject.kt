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
 * @param type The type of response format being defined: `json_object`
 */


data class ResponseFormatJsonObject (

    /* The type of response format being defined: `json_object` */
    @Json(name = "type")
    val type: ResponseFormatJsonObject.Type

) {

    /**
     * The type of response format being defined: `json_object`
     *
     * Values: json_object
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "json_object") json_object("json_object");
    }

}

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
 * @param type The type of tool being defined: `code_interpreter`
 */


data class AssistantToolsCode (

    /* The type of tool being defined: `code_interpreter` */
    @Json(name = "type")
    val type: AssistantToolsCode.Type

) {

    /**
     * The type of tool being defined: `code_interpreter`
     *
     * Values: code_interpreter
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "code_interpreter") code_interpreter("code_interpreter");
    }

}


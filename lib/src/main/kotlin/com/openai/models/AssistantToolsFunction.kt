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
 * @param type The type of tool being defined: `function`
 * @param function 
 */


data class AssistantToolsFunction (

    /* The type of tool being defined: `function` */
    @Json(name = "type")
    val type: AssistantToolsFunction.Type,

    @Json(name = "function")
    val function: FunctionObject

) {

    /**
     * The type of tool being defined: `function`
     *
     * Values: function
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "function") function("function");
    }

}


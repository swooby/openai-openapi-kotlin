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
 * @param type The type of the tool, i.e. `function`.
 * @param name The name of the function.
 * @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
 * @param parameters Parameters of the function in JSON Schema.
 */


data class RealtimeResponseCreateParamsToolsInner (

    /* The type of the tool, i.e. `function`. */
    @Json(name = "type")
    val type: RealtimeResponseCreateParamsToolsInner.Type? = null,

    /* The name of the function. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Parameters of the function in JSON Schema. */
    @Json(name = "parameters")
    val parameters: kotlin.Any? = null

) {

    /**
     * The type of the tool, i.e. `function`.
     *
     * Values: function
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "function") function("function");
    }

}


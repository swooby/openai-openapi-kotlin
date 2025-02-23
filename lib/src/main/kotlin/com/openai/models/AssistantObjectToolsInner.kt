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
 * @param function 
 * @param fileSearch 
 */


data class AssistantObjectToolsInner (

    /* The type of tool being defined: `code_interpreter` */
    @Json(name = "type")
    val type: AssistantObjectToolsInner.Type,

    @Json(name = "function")
    val function: FunctionObject,

    @Json(name = "file_search")
    val fileSearch: AssistantToolsFileSearchFileSearch? = null

) {

    /**
     * The type of tool being defined: `code_interpreter`
     *
     * Values: code_interpreter,file_search,function
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "code_interpreter") code_interpreter("code_interpreter"),
        @Json(name = "file_search") file_search("file_search"),
        @Json(name = "function") function("function");
    }

}


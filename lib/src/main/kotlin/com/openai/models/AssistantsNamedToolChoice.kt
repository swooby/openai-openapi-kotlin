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
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 *
 * @param type The type of the tool. If type is `function`, the function name must be set
 * @param function 
 */


data class AssistantsNamedToolChoice (

    /* The type of the tool. If type is `function`, the function name must be set */
    @Json(name = "type")
    val type: AssistantsNamedToolChoice.Type,

    @Json(name = "function")
    val function: AssistantsNamedToolChoiceFunction? = null

) {

    /**
     * The type of the tool. If type is `function`, the function name must be set
     *
     * Values: function,code_interpreter,file_search
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "function") function("function"),
        @Json(name = "code_interpreter") code_interpreter("code_interpreter"),
        @Json(name = "file_search") file_search("file_search");
    }

}


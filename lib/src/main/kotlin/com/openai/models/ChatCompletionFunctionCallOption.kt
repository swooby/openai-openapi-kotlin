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
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 *
 * @param name The name of the function to call.
 */


data class ChatCompletionFunctionCallOption (

    /* The name of the function to call. */
    @Json(name = "name")
    val name: kotlin.String

) {


}

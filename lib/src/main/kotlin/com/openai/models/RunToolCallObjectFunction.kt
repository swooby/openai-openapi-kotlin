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

/**
 * The function definition.
 *
 * @param name The name of the function.
 * @param arguments The arguments that the model expects you to pass to the function.
 */


data class RunToolCallObjectFunction (

    /* The name of the function. */
    @Json(name = "name")
    val name: kotlin.String,

    /* The arguments that the model expects you to pass to the function. */
    @Json(name = "arguments")
    val arguments: kotlin.String

) {


}


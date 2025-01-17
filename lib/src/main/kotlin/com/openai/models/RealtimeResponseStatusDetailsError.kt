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
 * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 *
 * @param type The type of error.
 * @param code Error code, if any.
 */


data class RealtimeResponseStatusDetailsError (

    /* The type of error. */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* Error code, if any. */
    @Json(name = "code")
    val code: kotlin.String? = null

) {


}


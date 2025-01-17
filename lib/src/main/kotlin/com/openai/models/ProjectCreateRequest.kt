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
 * @param name The friendly name of the project, this name appears in reports.
 */


data class ProjectCreateRequest (

    /* The friendly name of the project, this name appears in reports. */
    @Json(name = "name")
    val name: kotlin.String

) {


}

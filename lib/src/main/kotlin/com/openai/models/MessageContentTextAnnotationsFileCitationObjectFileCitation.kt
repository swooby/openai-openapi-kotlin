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
 * 
 *
 * @param fileId The ID of the specific File the citation is from.
 */


data class MessageContentTextAnnotationsFileCitationObjectFileCitation (

    /* The ID of the specific File the citation is from. */
    @Json(name = "file_id")
    val fileId: kotlin.String

) {


}


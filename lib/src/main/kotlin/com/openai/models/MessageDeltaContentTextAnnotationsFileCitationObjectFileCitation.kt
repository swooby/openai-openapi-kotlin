/**
 * Please note: This class is auto generated by OpenAPI Generator
 * (https://openapi-generator.tech). Do not edit this file manually.
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package com.openai.models

import com.squareup.moshi.Json

/**
 * @param fileId The ID of the specific File the citation is from.
 * @param quote The specific quote in the file.
 */
data class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(

    /* The ID of the specific File the citation is from. */
    @Json(name = "file_id") val fileId: kotlin.String? = null,

    /* The specific quote in the file. */
    @Json(name = "quote") val quote: kotlin.String? = null,
) {}

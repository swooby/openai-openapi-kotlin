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
 * @param fileId The ID of the file to attach to the message.
 * @param tools The tools to add this file to.
 */
data class CreateMessageRequestAttachmentsInner(

    /* The ID of the file to attach to the message. */
    @Json(name = "file_id") val fileId: kotlin.String? = null,

    /* The tools to add this file to. */
    @Json(name = "tools")
    val tools:
        kotlin.collections.List<
            CreateMessageRequestAttachmentsInnerToolsInner
        >? =
        null,
) {}

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
 * @param fileIds A list of [file](/docs/api-reference/files) IDs to add to the
 *   vector store. There can be a maximum of 10000 files in a vector store.
 * @param chunkingStrategy
 * @param metadata Set of 16 key-value pairs that can be attached to an object.
 *   This can be useful for storing additional information about the object in a
 *   structured format, and querying for objects via API or the dashboard. Keys
 *   are strings with a maximum length of 64 characters. Values are strings with
 *   a maximum length of 512 characters.
 */
data class CreateThreadRequestToolResourcesFileSearchVectorStoresInner(

    /* A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  */
    @Json(name = "file_ids")
    val fileIds: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "chunking_strategy")
    val chunkingStrategy:
        CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy? =
        null,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
) {}

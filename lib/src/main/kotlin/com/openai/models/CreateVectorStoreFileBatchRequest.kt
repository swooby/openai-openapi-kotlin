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

import com.openai.models.ChunkingStrategyRequestParam

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param fileIds A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
 * @param chunkingStrategy 
 */


data class CreateVectorStoreFileBatchRequest (

    /* A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. */
    @Json(name = "file_ids")
    val fileIds: kotlin.collections.List<kotlin.String>,

    @Json(name = "chunking_strategy")
    val chunkingStrategy: ChunkingStrategyRequestParam? = null

) {


}


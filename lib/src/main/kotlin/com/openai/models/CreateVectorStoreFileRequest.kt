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
 * @param fileId A [File](/docs/api-reference/files) ID that the vector store
 *   should use. Useful for tools like `file_search` that can access files.
 * @param chunkingStrategy
 */
data class CreateVectorStoreFileRequest(

    /* A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files. */
    @Json(name = "file_id") val fileId: kotlin.String,
    @Json(name = "chunking_strategy")
    val chunkingStrategy: ChunkingStrategyRequestParam? = null,
) {}

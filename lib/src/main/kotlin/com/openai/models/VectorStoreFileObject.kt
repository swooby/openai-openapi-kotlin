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
import com.squareup.moshi.JsonClass

/**
 * A list of files attached to a vector store.
 *
 * @param id The identifier, which can be referenced in API endpoints.
 * @param `object` The object type, which is always `vector_store.file`.
 * @param usageBytes The total vector store usage in bytes. Note that this may
 *   be different from the original file size.
 * @param createdAt The Unix timestamp (in seconds) for when the vector store
 *   file was created.
 * @param vectorStoreId The ID of the
 *   [vector store](/docs/api-reference/vector-stores/object) that the
 *   [File](/docs/api-reference/files) is attached to.
 * @param status The status of the vector store file, which can be either
 *   `in_progress`, `completed`, `cancelled`, or `failed`. The status
 *   `completed` indicates that the vector store file is ready for use.
 * @param lastError
 * @param chunkingStrategy
 */
data class VectorStoreFileObject(

    /* The identifier, which can be referenced in API endpoints. */
    @Json(name = "id") val id: kotlin.String,

    /* The object type, which is always `vector_store.file`. */
    @Json(name = "object") val `object`: VectorStoreFileObject.`Object`,

    /* The total vector store usage in bytes. Note that this may be different from the original file size. */
    @Json(name = "usage_bytes") val usageBytes: kotlin.Int,

    /* The Unix timestamp (in seconds) for when the vector store file was created. */
    @Json(name = "created_at") val createdAt: kotlin.Int,

    /* The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
    @Json(name = "vector_store_id") val vectorStoreId: kotlin.String,

    /* The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use. */
    @Json(name = "status") val status: VectorStoreFileObject.Status,
    @Json(name = "last_error") val lastError: VectorStoreFileObjectLastError?,
    @Json(name = "chunking_strategy")
    val chunkingStrategy: VectorStoreFileObjectChunkingStrategy? = null,
) {

    /**
     * The object type, which is always `vector_store.file`.
     *
     * Values: vector_storePeriodFile
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "vector_store.file")
        vector_storePeriodFile("vector_store.file")
    }

    /**
     * The status of the vector store file, which can be either `in_progress`,
     * `completed`, `cancelled`, or `failed`. The status `completed` indicates
     * that the vector store file is ready for use.
     *
     * Values: in_progress,completed,cancelled,failed
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "in_progress") in_progress("in_progress"),
        @Json(name = "completed") completed("completed"),
        @Json(name = "cancelled") cancelled("cancelled"),
        @Json(name = "failed") failed("failed"),
    }
}

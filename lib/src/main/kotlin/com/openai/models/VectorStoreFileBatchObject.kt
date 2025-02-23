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
 * A batch of files attached to a vector store.
 *
 * @param id The identifier, which can be referenced in API endpoints.
 * @param `object` The object type, which is always `vector_store.file_batch`.
 * @param createdAt The Unix timestamp (in seconds) for when the vector store files batch was created.
 * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
 * @param status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
 * @param fileCounts 
 */


data class VectorStoreFileBatchObject (

    /* The identifier, which can be referenced in API endpoints. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The object type, which is always `vector_store.file_batch`. */
    @Json(name = "object")
    val `object`: VectorStoreFileBatchObject.`Object`,

    /* The Unix timestamp (in seconds) for when the vector store files batch was created. */
    @Json(name = "created_at")
    val createdAt: kotlin.Int,

    /* The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
    @Json(name = "vector_store_id")
    val vectorStoreId: kotlin.String,

    /* The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. */
    @Json(name = "status")
    val status: VectorStoreFileBatchObject.Status,

    @Json(name = "file_counts")
    val fileCounts: VectorStoreFileBatchObjectFileCounts

) {

    /**
     * The object type, which is always `vector_store.file_batch`.
     *
     * Values: vector_storePeriodFiles_batch
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "vector_store.files_batch") vector_storePeriodFiles_batch("vector_store.files_batch");
    }
    /**
     * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
     *
     * Values: in_progress,completed,cancelled,failed
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "in_progress") in_progress("in_progress"),
        @Json(name = "completed") completed("completed"),
        @Json(name = "cancelled") cancelled("cancelled"),
        @Json(name = "failed") failed("failed");
    }

}


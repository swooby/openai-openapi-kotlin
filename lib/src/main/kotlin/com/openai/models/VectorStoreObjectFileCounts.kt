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
 * @param inProgress The number of files that are currently being processed.
 * @param completed The number of files that have been successfully processed.
 * @param failed The number of files that have failed to process.
 * @param cancelled The number of files that were cancelled.
 * @param total The total number of files.
 */


data class VectorStoreObjectFileCounts (

    /* The number of files that are currently being processed. */
    @Json(name = "in_progress")
    val inProgress: kotlin.Int,

    /* The number of files that have been successfully processed. */
    @Json(name = "completed")
    val completed: kotlin.Int,

    /* The number of files that have failed to process. */
    @Json(name = "failed")
    val failed: kotlin.Int,

    /* The number of files that were cancelled. */
    @Json(name = "cancelled")
    val cancelled: kotlin.Int,

    /* The total number of files. */
    @Json(name = "total")
    val total: kotlin.Int

) {


}


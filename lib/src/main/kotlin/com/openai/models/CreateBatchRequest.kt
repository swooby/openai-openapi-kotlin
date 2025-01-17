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
 * @param inputFileId The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
 * @param endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
 * @param completionWindow The time frame within which the batch should be processed. Currently only `24h` is supported.
 * @param metadata Optional custom metadata for the batch.
 */


data class CreateBatchRequest (

    /* The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  */
    @Json(name = "input_file_id")
    val inputFileId: kotlin.String,

    /* The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. */
    @Json(name = "endpoint")
    val endpoint: CreateBatchRequest.Endpoint,

    /* The time frame within which the batch should be processed. Currently only `24h` is supported. */
    @Json(name = "completion_window")
    val completionWindow: CreateBatchRequest.CompletionWindow,

    /* Optional custom metadata for the batch. */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) {

    /**
     * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
     *
     * Values: chatSlashCompletions,embeddings,completions
     */
    @JsonClass(generateAdapter = false)
    enum class Endpoint(val value: kotlin.String) {
        @Json(name = "/v1/chat/completions") chatSlashCompletions("/v1/chat/completions"),
        @Json(name = "/v1/embeddings") embeddings("/v1/embeddings"),
        @Json(name = "/v1/completions") completions("/v1/completions");
    }
    /**
     * The time frame within which the batch should be processed. Currently only `24h` is supported.
     *
     * Values: _24h
     */
    @JsonClass(generateAdapter = false)
    enum class CompletionWindow(val value: kotlin.String) {
        @Json(name = "24h") _24h("24h");
    }

}

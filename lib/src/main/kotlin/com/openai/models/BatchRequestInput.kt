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
 * The per-line object of the batch input file
 *
 * @param customId A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
 * @param method The HTTP method to be used for the request. Currently only `POST` is supported.
 * @param url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
 */


data class BatchRequestInput (

    /* A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. */
    @Json(name = "custom_id")
    val customId: kotlin.String? = null,

    /* The HTTP method to be used for the request. Currently only `POST` is supported. */
    @Json(name = "method")
    val method: BatchRequestInput.Method? = null,

    /* The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. */
    @Json(name = "url")
    val url: kotlin.String? = null

) {

    /**
     * The HTTP method to be used for the request. Currently only `POST` is supported.
     *
     * Values: POST
     */
    @JsonClass(generateAdapter = false)
    enum class Method(val value: kotlin.String) {
        @Json(name = "POST") POST("POST");
    }

}

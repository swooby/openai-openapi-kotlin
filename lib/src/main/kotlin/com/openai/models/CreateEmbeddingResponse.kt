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
 * @param `data` The list of embeddings generated by the model.
 * @param model The name of the model used to generate the embedding.
 * @param `object` The object type, which is always \"list\".
 * @param usage 
 */


data class CreateEmbeddingResponse (

    /* The list of embeddings generated by the model. */
    @Json(name = "data")
    val `data`: kotlin.collections.List<Embedding>,

    /* The name of the model used to generate the embedding. */
    @Json(name = "model")
    val model: kotlin.String,

    /* The object type, which is always \"list\". */
    @Json(name = "object")
    val `object`: CreateEmbeddingResponse.`Object`,

    @Json(name = "usage")
    val usage: CreateEmbeddingResponseUsage

) {

    /**
     * The object type, which is always \"list\".
     *
     * Values: list
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "list") list("list");
    }

}


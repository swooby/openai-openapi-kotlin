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

import com.openai.models.AutoChunkingStrategy
import com.openai.models.StaticChunkingStrategy
import com.openai.models.StaticChunkingStrategyStatic

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 *
 * @param type Always `auto`.
 * @param static 
 */


data class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy (

    /* Always `auto`. */
    @Json(name = "type")
    val type: CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.Type,

    @Json(name = "static")
    val static: StaticChunkingStrategyStatic

) {

    /**
     * Always `auto`.
     *
     * Values: auto,static
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "auto") auto("auto"),
        @Json(name = "static") static("static");
    }

}

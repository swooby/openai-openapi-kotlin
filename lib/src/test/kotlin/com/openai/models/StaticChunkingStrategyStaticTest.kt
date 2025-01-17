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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import com.openai.models.StaticChunkingStrategyStatic

class StaticChunkingStrategyStaticTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of StaticChunkingStrategyStatic
        //val modelInstance = StaticChunkingStrategyStatic()

        // to test the property `maxChunkSizeTokens` - The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
        should("test maxChunkSizeTokens") {
            // uncomment below to test the property
            //modelInstance.maxChunkSizeTokens shouldBe ("TODO")
        }

        // to test the property `chunkOverlapTokens` - The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
        should("test chunkOverlapTokens") {
            // uncomment below to test the property
            //modelInstance.chunkOverlapTokens shouldBe ("TODO")
        }

    }
}
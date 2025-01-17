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

import com.openai.models.CreateVectorStoreFileBatchRequest
import com.openai.models.ChunkingStrategyRequestParam

class CreateVectorStoreFileBatchRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateVectorStoreFileBatchRequest
        //val modelInstance = CreateVectorStoreFileBatchRequest()

        // to test the property `fileIds` - A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
        should("test fileIds") {
            // uncomment below to test the property
            //modelInstance.fileIds shouldBe ("TODO")
        }

        // to test the property `chunkingStrategy`
        should("test chunkingStrategy") {
            // uncomment below to test the property
            //modelInstance.chunkingStrategy shouldBe ("TODO")
        }

    }
}
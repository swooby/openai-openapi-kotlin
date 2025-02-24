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

import io.kotlintest.specs.ShouldSpec

class CreateVectorStoreFileRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateVectorStoreFileRequest
        // val modelInstance = CreateVectorStoreFileRequest()

        // to test the property `fileId` - A [File](/docs/api-reference/files)
        // ID that the vector store should use. Useful for tools like
        // `file_search` that can access files.
        should("test fileId") {
            // uncomment below to test the property
            // modelInstance.fileId shouldBe ("TODO")
        }

        // to test the property `chunkingStrategy`
        should("test chunkingStrategy") {
            // uncomment below to test the property
            // modelInstance.chunkingStrategy shouldBe ("TODO")
        }
    }
}

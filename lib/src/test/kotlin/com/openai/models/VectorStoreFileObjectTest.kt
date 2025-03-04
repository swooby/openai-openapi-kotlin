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

class VectorStoreFileObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of VectorStoreFileObject
        // val modelInstance = VectorStoreFileObject()

        // to test the property `id` - The identifier, which can be referenced
        // in API endpoints.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always
        // `vector_store.file`.
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `usageBytes` - The total vector store usage in
        // bytes. Note that this may be different from the original file size.
        should("test usageBytes") {
            // uncomment below to test the property
            // modelInstance.usageBytes shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds)
        // for when the vector store file was created.
        should("test createdAt") {
            // uncomment below to test the property
            // modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `vectorStoreId` - The ID of the [vector
        // store](/docs/api-reference/vector-stores/object) that the
        // [File](/docs/api-reference/files) is attached to.
        should("test vectorStoreId") {
            // uncomment below to test the property
            // modelInstance.vectorStoreId shouldBe ("TODO")
        }

        // to test the property `status` - The status of the vector store file,
        // which can be either `in_progress`, `completed`, `cancelled`, or
        // `failed`. The status `completed` indicates that the vector store file
        // is ready for use.
        should("test status") {
            // uncomment below to test the property
            // modelInstance.status shouldBe ("TODO")
        }

        // to test the property `lastError`
        should("test lastError") {
            // uncomment below to test the property
            // modelInstance.lastError shouldBe ("TODO")
        }

        // to test the property `chunkingStrategy`
        should("test chunkingStrategy") {
            // uncomment below to test the property
            // modelInstance.chunkingStrategy shouldBe ("TODO")
        }
    }
}

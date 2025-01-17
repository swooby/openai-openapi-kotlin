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

import com.openai.models.CreateThreadRequestToolResourcesFileSearch
import com.openai.models.CreateThreadRequestToolResourcesFileSearchVectorStoresInner

class CreateThreadRequestToolResourcesFileSearchTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateThreadRequestToolResourcesFileSearch
        //val modelInstance = CreateThreadRequestToolResourcesFileSearch()

        // to test the property `vectorStoreIds` - The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
        should("test vectorStoreIds") {
            // uncomment below to test the property
            //modelInstance.vectorStoreIds shouldBe ("TODO")
        }

        // to test the property `vectorStores` - A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
        should("test vectorStores") {
            // uncomment below to test the property
            //modelInstance.vectorStores shouldBe ("TODO")
        }

    }
}

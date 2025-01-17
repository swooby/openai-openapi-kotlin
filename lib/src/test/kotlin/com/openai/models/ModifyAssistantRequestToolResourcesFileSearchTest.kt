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

import com.openai.models.ModifyAssistantRequestToolResourcesFileSearch

class ModifyAssistantRequestToolResourcesFileSearchTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ModifyAssistantRequestToolResourcesFileSearch
        //val modelInstance = ModifyAssistantRequestToolResourcesFileSearch()

        // to test the property `vectorStoreIds` - Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
        should("test vectorStoreIds") {
            // uncomment below to test the property
            //modelInstance.vectorStoreIds shouldBe ("TODO")
        }

    }
}

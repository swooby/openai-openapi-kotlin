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

import com.openai.models.ModifyAssistantRequestToolResourcesCodeInterpreter

class ModifyAssistantRequestToolResourcesCodeInterpreterTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ModifyAssistantRequestToolResourcesCodeInterpreter
        //val modelInstance = ModifyAssistantRequestToolResourcesCodeInterpreter()

        // to test the property `fileIds` - Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
        should("test fileIds") {
            // uncomment below to test the property
            //modelInstance.fileIds shouldBe ("TODO")
        }

    }
}
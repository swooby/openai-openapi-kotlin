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

import com.openai.models.CreateChatCompletionRequestResponseFormat
import com.openai.models.ResponseFormatJsonObject
import com.openai.models.ResponseFormatJsonSchema
import com.openai.models.ResponseFormatJsonSchemaJsonSchema
import com.openai.models.ResponseFormatText

class CreateChatCompletionRequestResponseFormatTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateChatCompletionRequestResponseFormat
        //val modelInstance = CreateChatCompletionRequestResponseFormat()

        // to test the property `type` - The type of response format being defined: `text`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `jsonSchema`
        should("test jsonSchema") {
            // uncomment below to test the property
            //modelInstance.jsonSchema shouldBe ("TODO")
        }

    }
}
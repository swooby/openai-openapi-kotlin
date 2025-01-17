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

import com.openai.models.ChatCompletionFunctions

class ChatCompletionFunctionsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatCompletionFunctions
        //val modelInstance = ChatCompletionFunctions()

        // to test the property `name` - The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `description` - A description of what the function does, used by the model to choose when and how to call the function.
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `parameters` - The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
        should("test parameters") {
            // uncomment below to test the property
            //modelInstance.parameters shouldBe ("TODO")
        }

    }
}

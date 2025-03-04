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

class ChatCompletionMessageToolCallChunkFunctionTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // ChatCompletionMessageToolCallChunkFunction
        // val modelInstance = ChatCompletionMessageToolCallChunkFunction()

        // to test the property `name` - The name of the function to call.
        should("test name") {
            // uncomment below to test the property
            // modelInstance.name shouldBe ("TODO")
        }

        // to test the property `arguments` - The arguments to call the function
        // with, as generated by the model in JSON format. Note that the model
        // does not always generate valid JSON, and may hallucinate parameters
        // not defined by your function schema. Validate the arguments in your
        // code before calling your function.
        should("test arguments") {
            // uncomment below to test the property
            // modelInstance.arguments shouldBe ("TODO")
        }
    }
}

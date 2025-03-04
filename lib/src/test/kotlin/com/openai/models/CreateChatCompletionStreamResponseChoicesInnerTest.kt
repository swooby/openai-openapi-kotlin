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

class CreateChatCompletionStreamResponseChoicesInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // CreateChatCompletionStreamResponseChoicesInner
        // val modelInstance = CreateChatCompletionStreamResponseChoicesInner()

        // to test the property `delta`
        should("test delta") {
            // uncomment below to test the property
            // modelInstance.delta shouldBe ("TODO")
        }

        // to test the property `finishReason` - The reason the model stopped
        // generating tokens. This will be `stop` if the model hit a natural
        // stop point or a provided stop sequence, `length` if the maximum
        // number of tokens specified in the request was reached,
        // `content_filter` if content was omitted due to a flag from our
        // content filters, `tool_calls` if the model called a tool, or
        // `function_call` (deprecated) if the model called a function.
        should("test finishReason") {
            // uncomment below to test the property
            // modelInstance.finishReason shouldBe ("TODO")
        }

        // to test the property `index` - The index of the choice in the list of
        // choices.
        should("test index") {
            // uncomment below to test the property
            // modelInstance.index shouldBe ("TODO")
        }

        // to test the property `logprobs`
        should("test logprobs") {
            // uncomment below to test the property
            // modelInstance.logprobs shouldBe ("TODO")
        }
    }
}

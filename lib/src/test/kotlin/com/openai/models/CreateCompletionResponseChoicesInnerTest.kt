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

class CreateCompletionResponseChoicesInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // CreateCompletionResponseChoicesInner
        // val modelInstance = CreateCompletionResponseChoicesInner()

        // to test the property `finishReason` - The reason the model stopped
        // generating tokens. This will be `stop` if the model hit a natural
        // stop point or a provided stop sequence, `length` if the maximum
        // number of tokens specified in the request was reached, or
        // `content_filter` if content was omitted due to a flag from our
        // content filters.
        should("test finishReason") {
            // uncomment below to test the property
            // modelInstance.finishReason shouldBe ("TODO")
        }

        // to test the property `index`
        should("test index") {
            // uncomment below to test the property
            // modelInstance.index shouldBe ("TODO")
        }

        // to test the property `logprobs`
        should("test logprobs") {
            // uncomment below to test the property
            // modelInstance.logprobs shouldBe ("TODO")
        }

        // to test the property `text`
        should("test text") {
            // uncomment below to test the property
            // modelInstance.text shouldBe ("TODO")
        }
    }
}

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

class CreateChatCompletionResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateChatCompletionResponse
        // val modelInstance = CreateChatCompletionResponse()

        // to test the property `id` - A unique identifier for the chat
        // completion.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `choices` - A list of chat completion choices.
        // Can be more than one if `n` is greater than 1.
        should("test choices") {
            // uncomment below to test the property
            // modelInstance.choices shouldBe ("TODO")
        }

        // to test the property `created` - The Unix timestamp (in seconds) of
        // when the chat completion was created.
        should("test created") {
            // uncomment below to test the property
            // modelInstance.created shouldBe ("TODO")
        }

        // to test the property `model` - The model used for the chat
        // completion.
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always
        // `chat.completion`.
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `serviceTier` - The service tier used for
        // processing the request.
        should("test serviceTier") {
            // uncomment below to test the property
            // modelInstance.serviceTier shouldBe ("TODO")
        }

        // to test the property `systemFingerprint` - This fingerprint
        // represents the backend configuration that the model runs with.  Can
        // be used in conjunction with the `seed` request parameter to
        // understand when backend changes have been made that might impact
        // determinism.
        should("test systemFingerprint") {
            // uncomment below to test the property
            // modelInstance.systemFingerprint shouldBe ("TODO")
        }

        // to test the property `usage`
        should("test usage") {
            // uncomment below to test the property
            // modelInstance.usage shouldBe ("TODO")
        }
    }
}

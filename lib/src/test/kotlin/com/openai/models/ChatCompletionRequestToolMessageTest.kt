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

class ChatCompletionRequestToolMessageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // ChatCompletionRequestToolMessage
        // val modelInstance = ChatCompletionRequestToolMessage()

        // to test the property `role` - The role of the messages author, in
        // this case `tool`.
        should("test role") {
            // uncomment below to test the property
            // modelInstance.role shouldBe ("TODO")
        }

        // to test the property `content`
        should("test content") {
            // uncomment below to test the property
            // modelInstance.content shouldBe ("TODO")
        }

        // to test the property `toolCallId` - Tool call that this message is
        // responding to.
        should("test toolCallId") {
            // uncomment below to test the property
            // modelInstance.toolCallId shouldBe ("TODO")
        }
    }
}

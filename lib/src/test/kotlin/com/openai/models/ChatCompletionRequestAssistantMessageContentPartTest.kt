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

import com.openai.models.ChatCompletionRequestAssistantMessageContentPart
import com.openai.models.ChatCompletionRequestMessageContentPartRefusal
import com.openai.models.ChatCompletionRequestMessageContentPartText

class ChatCompletionRequestAssistantMessageContentPartTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChatCompletionRequestAssistantMessageContentPart
        //val modelInstance = ChatCompletionRequestAssistantMessageContentPart()

        // to test the property `type` - The type of the content part.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `text` - The text content.
        should("test text") {
            // uncomment below to test the property
            //modelInstance.text shouldBe ("TODO")
        }

        // to test the property `refusal` - The refusal message generated by the model.
        should("test refusal") {
            // uncomment below to test the property
            //modelInstance.refusal shouldBe ("TODO")
        }

    }
}

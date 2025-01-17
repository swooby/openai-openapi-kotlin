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

import com.openai.models.CreateChatCompletionFunctionResponseChoicesInner
import com.openai.models.ChatCompletionResponseMessage

class CreateChatCompletionFunctionResponseChoicesInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateChatCompletionFunctionResponseChoicesInner
        //val modelInstance = CreateChatCompletionFunctionResponseChoicesInner()

        // to test the property `finishReason` - The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
        should("test finishReason") {
            // uncomment below to test the property
            //modelInstance.finishReason shouldBe ("TODO")
        }

        // to test the property `index` - The index of the choice in the list of choices.
        should("test index") {
            // uncomment below to test the property
            //modelInstance.index shouldBe ("TODO")
        }

        // to test the property `message`
        should("test message") {
            // uncomment below to test the property
            //modelInstance.message shouldBe ("TODO")
        }

    }
}

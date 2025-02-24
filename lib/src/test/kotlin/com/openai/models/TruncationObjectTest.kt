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

class TruncationObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TruncationObject
        // val modelInstance = TruncationObject()

        // to test the property `type` - The truncation strategy to use for the
        // thread. The default is `auto`. If set to `last_messages`, the thread
        // will be truncated to the n most recent messages in the thread. When
        // set to `auto`, messages in the middle of the thread will be dropped
        // to fit the context length of the model, `max_prompt_tokens`.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `lastMessages` - The number of most recent
        // messages from the thread when constructing the context for the run.
        should("test lastMessages") {
            // uncomment below to test the property
            // modelInstance.lastMessages shouldBe ("TODO")
        }
    }
}

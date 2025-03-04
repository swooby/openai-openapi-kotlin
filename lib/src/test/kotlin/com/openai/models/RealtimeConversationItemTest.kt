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

class RealtimeConversationItemTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeConversationItem
        // val modelInstance = RealtimeConversationItem()

        // to test the property `id` - The unique ID of the item, this can be
        // generated by the client to help  manage server-side context, but is
        // not required because the server will  generate one if not provided.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `type` - The type of the item (`message`,
        // `function_call`, `function_call_output`).
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property ``object`` - Identifier for the API object being
        // returned - always `realtime.item`.
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `status` - The status of the item (`completed`,
        // `incomplete`). These have no effect  on the conversation, but are
        // accepted for consistency with the  `conversation.item.created` event.
        should("test status") {
            // uncomment below to test the property
            // modelInstance.status shouldBe ("TODO")
        }

        // to test the property `role` - The role of the message sender (`user`,
        // `assistant`, `system`), only  applicable for `message` items.
        should("test role") {
            // uncomment below to test the property
            // modelInstance.role shouldBe ("TODO")
        }

        // to test the property `content` - The content of the message,
        // applicable for `message` items.  - Message items of role `system`
        // support only `input_text` content - Message items of role `user`
        // support `input_text` and `input_audio`    content - Message items of
        // role `assistant` support `text` content.
        should("test content") {
            // uncomment below to test the property
            // modelInstance.content shouldBe ("TODO")
        }

        // to test the property `callId` - The ID of the function call (for
        // `function_call` and  `function_call_output` items). If passed on a
        // `function_call_output`  item, the server will check that a
        // `function_call` item with the same  ID exists in the conversation
        // history.
        should("test callId") {
            // uncomment below to test the property
            // modelInstance.callId shouldBe ("TODO")
        }

        // to test the property `name` - The name of the function being called
        // (for `function_call` items).
        should("test name") {
            // uncomment below to test the property
            // modelInstance.name shouldBe ("TODO")
        }

        // to test the property `arguments` - The arguments of the function call
        // (for `function_call` items).
        should("test arguments") {
            // uncomment below to test the property
            // modelInstance.arguments shouldBe ("TODO")
        }

        // to test the property `output` - The output of the function call (for
        // `function_call_output` items).
        should("test output") {
            // uncomment below to test the property
            // modelInstance.output shouldBe ("TODO")
        }
    }
}

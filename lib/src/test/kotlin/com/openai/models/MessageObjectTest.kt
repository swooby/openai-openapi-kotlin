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

import com.openai.models.MessageObject
import com.openai.models.CreateMessageRequestAttachmentsInner
import com.openai.models.MessageObjectContentInner
import com.openai.models.MessageObjectIncompleteDetails

class MessageObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MessageObject
        //val modelInstance = MessageObject()

        // to test the property `id` - The identifier, which can be referenced in API endpoints.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always `thread.message`.
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds) for when the message was created.
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `threadId` - The [thread](/docs/api-reference/threads) ID that this message belongs to.
        should("test threadId") {
            // uncomment below to test the property
            //modelInstance.threadId shouldBe ("TODO")
        }

        // to test the property `status` - The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `incompleteDetails`
        should("test incompleteDetails") {
            // uncomment below to test the property
            //modelInstance.incompleteDetails shouldBe ("TODO")
        }

        // to test the property `completedAt` - The Unix timestamp (in seconds) for when the message was completed.
        should("test completedAt") {
            // uncomment below to test the property
            //modelInstance.completedAt shouldBe ("TODO")
        }

        // to test the property `incompleteAt` - The Unix timestamp (in seconds) for when the message was marked as incomplete.
        should("test incompleteAt") {
            // uncomment below to test the property
            //modelInstance.incompleteAt shouldBe ("TODO")
        }

        // to test the property `role` - The entity that produced the message. One of `user` or `assistant`.
        should("test role") {
            // uncomment below to test the property
            //modelInstance.role shouldBe ("TODO")
        }

        // to test the property `content` - The content of the message in array of text and/or images.
        should("test content") {
            // uncomment below to test the property
            //modelInstance.content shouldBe ("TODO")
        }

        // to test the property `assistantId` - If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
        should("test assistantId") {
            // uncomment below to test the property
            //modelInstance.assistantId shouldBe ("TODO")
        }

        // to test the property `runId` - The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
        should("test runId") {
            // uncomment below to test the property
            //modelInstance.runId shouldBe ("TODO")
        }

        // to test the property `attachments` - A list of files attached to the message, and the tools they were added to.
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `metadata` - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
        should("test metadata") {
            // uncomment below to test the property
            //modelInstance.metadata shouldBe ("TODO")
        }

    }
}

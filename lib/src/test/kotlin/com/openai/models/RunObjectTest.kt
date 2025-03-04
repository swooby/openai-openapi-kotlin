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

class RunObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RunObject
        // val modelInstance = RunObject()

        // to test the property `id` - The identifier, which can be referenced
        // in API endpoints.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always
        // `thread.run`.
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds)
        // for when the run was created.
        should("test createdAt") {
            // uncomment below to test the property
            // modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `threadId` - The ID of the
        // [thread](/docs/api-reference/threads) that was executed on as a part
        // of this run.
        should("test threadId") {
            // uncomment below to test the property
            // modelInstance.threadId shouldBe ("TODO")
        }

        // to test the property `assistantId` - The ID of the
        // [assistant](/docs/api-reference/assistants) used for execution of
        // this run.
        should("test assistantId") {
            // uncomment below to test the property
            // modelInstance.assistantId shouldBe ("TODO")
        }

        // to test the property `status` - The status of the run, which can be
        // either `queued`, `in_progress`, `requires_action`, `cancelling`,
        // `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
        should("test status") {
            // uncomment below to test the property
            // modelInstance.status shouldBe ("TODO")
        }

        // to test the property `requiredAction`
        should("test requiredAction") {
            // uncomment below to test the property
            // modelInstance.requiredAction shouldBe ("TODO")
        }

        // to test the property `lastError`
        should("test lastError") {
            // uncomment below to test the property
            // modelInstance.lastError shouldBe ("TODO")
        }

        // to test the property `expiresAt` - The Unix timestamp (in seconds)
        // for when the run will expire.
        should("test expiresAt") {
            // uncomment below to test the property
            // modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property `startedAt` - The Unix timestamp (in seconds)
        // for when the run was started.
        should("test startedAt") {
            // uncomment below to test the property
            // modelInstance.startedAt shouldBe ("TODO")
        }

        // to test the property `cancelledAt` - The Unix timestamp (in seconds)
        // for when the run was cancelled.
        should("test cancelledAt") {
            // uncomment below to test the property
            // modelInstance.cancelledAt shouldBe ("TODO")
        }

        // to test the property `failedAt` - The Unix timestamp (in seconds) for
        // when the run failed.
        should("test failedAt") {
            // uncomment below to test the property
            // modelInstance.failedAt shouldBe ("TODO")
        }

        // to test the property `completedAt` - The Unix timestamp (in seconds)
        // for when the run was completed.
        should("test completedAt") {
            // uncomment below to test the property
            // modelInstance.completedAt shouldBe ("TODO")
        }

        // to test the property `incompleteDetails`
        should("test incompleteDetails") {
            // uncomment below to test the property
            // modelInstance.incompleteDetails shouldBe ("TODO")
        }

        // to test the property `model` - The model that the
        // [assistant](/docs/api-reference/assistants) used for this run.
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property `instructions` - The instructions that the
        // [assistant](/docs/api-reference/assistants) used for this run.
        should("test instructions") {
            // uncomment below to test the property
            // modelInstance.instructions shouldBe ("TODO")
        }

        // to test the property `tools` - The list of tools that the
        // [assistant](/docs/api-reference/assistants) used for this run.
        should("test tools") {
            // uncomment below to test the property
            // modelInstance.tools shouldBe ("TODO")
        }

        // to test the property `metadata` - Set of 16 key-value pairs that can
        // be attached to an object. This can be useful for storing additional
        // information about the object in a structured format, and querying for
        // objects via API or the dashboard.   Keys are strings with a maximum
        // length of 64 characters. Values are strings with a maximum length of
        // 512 characters.
        should("test metadata") {
            // uncomment below to test the property
            // modelInstance.metadata shouldBe ("TODO")
        }

        // to test the property `usage`
        should("test usage") {
            // uncomment below to test the property
            // modelInstance.usage shouldBe ("TODO")
        }

        // to test the property `maxPromptTokens` - The maximum number of prompt
        // tokens specified to have been used over the course of the run.
        should("test maxPromptTokens") {
            // uncomment below to test the property
            // modelInstance.maxPromptTokens shouldBe ("TODO")
        }

        // to test the property `maxCompletionTokens` - The maximum number of
        // completion tokens specified to have been used over the course of the
        // run.
        should("test maxCompletionTokens") {
            // uncomment below to test the property
            // modelInstance.maxCompletionTokens shouldBe ("TODO")
        }

        // to test the property `truncationStrategy`
        should("test truncationStrategy") {
            // uncomment below to test the property
            // modelInstance.truncationStrategy shouldBe ("TODO")
        }

        // to test the property `toolChoice`
        should("test toolChoice") {
            // uncomment below to test the property
            // modelInstance.toolChoice shouldBe ("TODO")
        }

        // to test the property `parallelToolCalls` - Whether to enable
        // [parallel function
        // calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
        should("test parallelToolCalls") {
            // uncomment below to test the property
            // modelInstance.parallelToolCalls shouldBe ("TODO")
        }

        // to test the property `responseFormat`
        should("test responseFormat") {
            // uncomment below to test the property
            // modelInstance.responseFormat shouldBe ("TODO")
        }

        // to test the property `temperature` - The sampling temperature used
        // for this run. If not set, defaults to 1.
        should("test temperature") {
            // uncomment below to test the property
            // modelInstance.temperature shouldBe ("TODO")
        }

        // to test the property `topP` - The nucleus sampling value used for
        // this run. If not set, defaults to 1.
        should("test topP") {
            // uncomment below to test the property
            // modelInstance.topP shouldBe ("TODO")
        }
    }
}

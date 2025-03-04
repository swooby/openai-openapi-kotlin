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

package com.openai.apis

import io.kotlintest.specs.ShouldSpec

class AssistantsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AssistantsApi
        // val apiInstance = AssistantsApi()

        // to test cancelRun
        should("test cancelRun") {
            // uncomment below to test cancelRun
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to which this run belongs.
            // val runId : kotlin.String = runId_example // kotlin.String | The
            // ID of the run to cancel.
            // val result : RunObject = apiInstance.cancelRun(threadId, runId)
            // result shouldBe ("TODO")
        }

        // to test createAssistant
        should("test createAssistant") {
            // uncomment below to test createAssistant
            // val createAssistantRequest : CreateAssistantRequest =  //
            // CreateAssistantRequest |
            // val result : AssistantObject =
            // apiInstance.createAssistant(createAssistantRequest)
            // result shouldBe ("TODO")
        }

        // to test createMessage
        should("test createMessage") {
            // uncomment below to test createMessage
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the [thread](/docs/api-reference/threads) to create a
            // message for.
            // val createMessageRequest : CreateMessageRequest =  //
            // CreateMessageRequest |
            // val result : MessageObject = apiInstance.createMessage(threadId,
            // createMessageRequest)
            // result shouldBe ("TODO")
        }

        // to test createRun
        should("test createRun") {
            // uncomment below to test createRun
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to run.
            // val createRunRequest : CreateRunRequest =  // CreateRunRequest |
            // val include : kotlin.collections.List<kotlin.String> =  //
            // kotlin.collections.List<kotlin.String> | A list of additional
            // fields to include in the response. Currently the only supported
            // value is
            // `step_details.tool_calls[*].file_search.results[*].content` to
            // fetch the file search result content.  See the [file search tool
            // documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
            // val result : RunObject = apiInstance.createRun(threadId,
            // createRunRequest, include)
            // result shouldBe ("TODO")
        }

        // to test createThread
        should("test createThread") {
            // uncomment below to test createThread
            // val createThreadRequest : CreateThreadRequest =  //
            // CreateThreadRequest |
            // val result : ThreadObject =
            // apiInstance.createThread(createThreadRequest)
            // result shouldBe ("TODO")
        }

        // to test createThreadAndRun
        should("test createThreadAndRun") {
            // uncomment below to test createThreadAndRun
            // val createThreadAndRunRequest : CreateThreadAndRunRequest =  //
            // CreateThreadAndRunRequest |
            // val result : RunObject =
            // apiInstance.createThreadAndRun(createThreadAndRunRequest)
            // result shouldBe ("TODO")
        }

        // to test deleteAssistant
        should("test deleteAssistant") {
            // uncomment below to test deleteAssistant
            // val assistantId : kotlin.String = assistantId_example //
            // kotlin.String | The ID of the assistant to delete.
            // val result : DeleteAssistantResponse =
            // apiInstance.deleteAssistant(assistantId)
            // result shouldBe ("TODO")
        }

        // to test deleteMessage
        should("test deleteMessage") {
            // uncomment below to test deleteMessage
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to which this message belongs.
            // val messageId : kotlin.String = messageId_example //
            // kotlin.String | The ID of the message to delete.
            // val result : DeleteMessageResponse =
            // apiInstance.deleteMessage(threadId, messageId)
            // result shouldBe ("TODO")
        }

        // to test deleteThread
        should("test deleteThread") {
            // uncomment below to test deleteThread
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to delete.
            // val result : DeleteThreadResponse =
            // apiInstance.deleteThread(threadId)
            // result shouldBe ("TODO")
        }

        // to test getAssistant
        should("test getAssistant") {
            // uncomment below to test getAssistant
            // val assistantId : kotlin.String = assistantId_example //
            // kotlin.String | The ID of the assistant to retrieve.
            // val result : AssistantObject =
            // apiInstance.getAssistant(assistantId)
            // result shouldBe ("TODO")
        }

        // to test getMessage
        should("test getMessage") {
            // uncomment below to test getMessage
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the [thread](/docs/api-reference/threads) to which
            // this message belongs.
            // val messageId : kotlin.String = messageId_example //
            // kotlin.String | The ID of the message to retrieve.
            // val result : MessageObject = apiInstance.getMessage(threadId,
            // messageId)
            // result shouldBe ("TODO")
        }

        // to test getRun
        should("test getRun") {
            // uncomment below to test getRun
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the [thread](/docs/api-reference/threads) that was
            // run.
            // val runId : kotlin.String = runId_example // kotlin.String | The
            // ID of the run to retrieve.
            // val result : RunObject = apiInstance.getRun(threadId, runId)
            // result shouldBe ("TODO")
        }

        // to test getRunStep
        should("test getRunStep") {
            // uncomment below to test getRunStep
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to which the run and run step belongs.
            // val runId : kotlin.String = runId_example // kotlin.String | The
            // ID of the run to which the run step belongs.
            // val stepId : kotlin.String = stepId_example // kotlin.String |
            // The ID of the run step to retrieve.
            // val include : kotlin.collections.List<kotlin.String> =  //
            // kotlin.collections.List<kotlin.String> | A list of additional
            // fields to include in the response. Currently the only supported
            // value is
            // `step_details.tool_calls[*].file_search.results[*].content` to
            // fetch the file search result content.  See the [file search tool
            // documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
            // val result : RunStepObject = apiInstance.getRunStep(threadId,
            // runId, stepId, include)
            // result shouldBe ("TODO")
        }

        // to test getThread
        should("test getThread") {
            // uncomment below to test getThread
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to retrieve.
            // val result : ThreadObject = apiInstance.getThread(threadId)
            // result shouldBe ("TODO")
        }

        // to test listAssistants
        should("test listAssistants") {
            // uncomment below to test listAssistants
            // val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number
            // of objects to be returned. Limit can range between 1 and 100, and
            // the default is 20.
            // val order : kotlin.String = order_example // kotlin.String | Sort
            // order by the `created_at` timestamp of the objects. `asc` for
            // ascending order and `desc` for descending order.
            // val after : kotlin.String = after_example // kotlin.String | A
            // cursor for use in pagination. `after` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, ending with obj_foo, your
            // subsequent call can include after=obj_foo in order to fetch the
            // next page of the list.
            // val before : kotlin.String = before_example // kotlin.String | A
            // cursor for use in pagination. `before` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, starting with obj_foo, your
            // subsequent call can include before=obj_foo in order to fetch the
            // previous page of the list.
            // val result : ListAssistantsResponse =
            // apiInstance.listAssistants(limit, order, after, before)
            // result shouldBe ("TODO")
        }

        // to test listMessages
        should("test listMessages") {
            // uncomment below to test listMessages
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the [thread](/docs/api-reference/threads) the
            // messages belong to.
            // val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number
            // of objects to be returned. Limit can range between 1 and 100, and
            // the default is 20.
            // val order : kotlin.String = order_example // kotlin.String | Sort
            // order by the `created_at` timestamp of the objects. `asc` for
            // ascending order and `desc` for descending order.
            // val after : kotlin.String = after_example // kotlin.String | A
            // cursor for use in pagination. `after` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, ending with obj_foo, your
            // subsequent call can include after=obj_foo in order to fetch the
            // next page of the list.
            // val before : kotlin.String = before_example // kotlin.String | A
            // cursor for use in pagination. `before` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, starting with obj_foo, your
            // subsequent call can include before=obj_foo in order to fetch the
            // previous page of the list.
            // val runId : kotlin.String = runId_example // kotlin.String |
            // Filter messages by the run ID that generated them.
            // val result : ListMessagesResponse =
            // apiInstance.listMessages(threadId, limit, order, after, before,
            // runId)
            // result shouldBe ("TODO")
        }

        // to test listRunSteps
        should("test listRunSteps") {
            // uncomment below to test listRunSteps
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread the run and run steps belong to.
            // val runId : kotlin.String = runId_example // kotlin.String | The
            // ID of the run the run steps belong to.
            // val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number
            // of objects to be returned. Limit can range between 1 and 100, and
            // the default is 20.
            // val order : kotlin.String = order_example // kotlin.String | Sort
            // order by the `created_at` timestamp of the objects. `asc` for
            // ascending order and `desc` for descending order.
            // val after : kotlin.String = after_example // kotlin.String | A
            // cursor for use in pagination. `after` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, ending with obj_foo, your
            // subsequent call can include after=obj_foo in order to fetch the
            // next page of the list.
            // val before : kotlin.String = before_example // kotlin.String | A
            // cursor for use in pagination. `before` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, starting with obj_foo, your
            // subsequent call can include before=obj_foo in order to fetch the
            // previous page of the list.
            // val include : kotlin.collections.List<kotlin.String> =  //
            // kotlin.collections.List<kotlin.String> | A list of additional
            // fields to include in the response. Currently the only supported
            // value is
            // `step_details.tool_calls[*].file_search.results[*].content` to
            // fetch the file search result content.  See the [file search tool
            // documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
            // val result : ListRunStepsResponse =
            // apiInstance.listRunSteps(threadId, runId, limit, order, after,
            // before, include)
            // result shouldBe ("TODO")
        }

        // to test listRuns
        should("test listRuns") {
            // uncomment below to test listRuns
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread the run belongs to.
            // val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number
            // of objects to be returned. Limit can range between 1 and 100, and
            // the default is 20.
            // val order : kotlin.String = order_example // kotlin.String | Sort
            // order by the `created_at` timestamp of the objects. `asc` for
            // ascending order and `desc` for descending order.
            // val after : kotlin.String = after_example // kotlin.String | A
            // cursor for use in pagination. `after` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, ending with obj_foo, your
            // subsequent call can include after=obj_foo in order to fetch the
            // next page of the list.
            // val before : kotlin.String = before_example // kotlin.String | A
            // cursor for use in pagination. `before` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, starting with obj_foo, your
            // subsequent call can include before=obj_foo in order to fetch the
            // previous page of the list.
            // val result : ListRunsResponse = apiInstance.listRuns(threadId,
            // limit, order, after, before)
            // result shouldBe ("TODO")
        }

        // to test modifyAssistant
        should("test modifyAssistant") {
            // uncomment below to test modifyAssistant
            // val assistantId : kotlin.String = assistantId_example //
            // kotlin.String | The ID of the assistant to modify.
            // val modifyAssistantRequest : ModifyAssistantRequest =  //
            // ModifyAssistantRequest |
            // val result : AssistantObject =
            // apiInstance.modifyAssistant(assistantId, modifyAssistantRequest)
            // result shouldBe ("TODO")
        }

        // to test modifyMessage
        should("test modifyMessage") {
            // uncomment below to test modifyMessage
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to which this message belongs.
            // val messageId : kotlin.String = messageId_example //
            // kotlin.String | The ID of the message to modify.
            // val modifyMessageRequest : ModifyMessageRequest =  //
            // ModifyMessageRequest |
            // val result : MessageObject = apiInstance.modifyMessage(threadId,
            // messageId, modifyMessageRequest)
            // result shouldBe ("TODO")
        }

        // to test modifyRun
        should("test modifyRun") {
            // uncomment below to test modifyRun
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the [thread](/docs/api-reference/threads) that was
            // run.
            // val runId : kotlin.String = runId_example // kotlin.String | The
            // ID of the run to modify.
            // val modifyRunRequest : ModifyRunRequest =  // ModifyRunRequest |
            // val result : RunObject = apiInstance.modifyRun(threadId, runId,
            // modifyRunRequest)
            // result shouldBe ("TODO")
        }

        // to test modifyThread
        should("test modifyThread") {
            // uncomment below to test modifyThread
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the thread to modify. Only the `metadata` can be
            // modified.
            // val modifyThreadRequest : ModifyThreadRequest =  //
            // ModifyThreadRequest |
            // val result : ThreadObject = apiInstance.modifyThread(threadId,
            // modifyThreadRequest)
            // result shouldBe ("TODO")
        }

        // to test submitToolOuputsToRun
        should("test submitToolOuputsToRun") {
            // uncomment below to test submitToolOuputsToRun
            // val threadId : kotlin.String = threadId_example // kotlin.String
            // | The ID of the [thread](/docs/api-reference/threads) to which
            // this run belongs.
            // val runId : kotlin.String = runId_example // kotlin.String | The
            // ID of the run that requires the tool output submission.
            // val submitToolOutputsRunRequest : SubmitToolOutputsRunRequest =
            // // SubmitToolOutputsRunRequest |
            // val result : RunObject =
            // apiInstance.submitToolOuputsToRun(threadId, runId,
            // submitToolOutputsRunRequest)
            // result shouldBe ("TODO")
        }
    }
}

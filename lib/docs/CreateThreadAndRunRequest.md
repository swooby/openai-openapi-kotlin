
# CreateThreadAndRunRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assistantId** | **kotlin.String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. |  |
| **thread** | [**CreateThreadRequest**](CreateThreadRequest.md) |  |  [optional] |
| **model** | [**CreateThreadAndRunRequestModel**](CreateThreadAndRunRequestModel.md) |  |  [optional] |
| **instructions** | **kotlin.String** | Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. |  [optional] |
| **tools** | [**kotlin.collections.List&lt;CreateThreadAndRunRequestToolsInner&gt;**](CreateThreadAndRunRequestToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. |  [optional] |
| **toolResources** | [**CreateThreadAndRunRequestToolResources**](CreateThreadAndRunRequestToolResources.md) |  |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  |  [optional] |
| **temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  |  [optional] |
| **topP** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  |  [optional] |
| **stream** | **kotlin.Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  |  [optional] |
| **maxPromptTokens** | **kotlin.Int** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional] |
| **maxCompletionTokens** | **kotlin.Int** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional] |
| **truncationStrategy** | [**CreateRunRequestTruncationStrategy**](CreateRunRequestTruncationStrategy.md) |  |  [optional] |
| **toolChoice** | [**CreateRunRequestToolChoice**](CreateRunRequestToolChoice.md) |  |  [optional] |
| **parallelToolCalls** | **kotlin.Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. |  [optional] |
| **responseFormat** | [**AssistantObjectResponseFormat**](AssistantObjectResponseFormat.md) |  |  [optional] |




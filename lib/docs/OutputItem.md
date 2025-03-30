
# OutputItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The unique identifier of the reasoning content.  |  |
| **type** | [**inline**](#Type) | The type of the output message. Always &#x60;message&#x60;.  |  |
| **role** | [**inline**](#Role) | The role of the output message. Always &#x60;assistant&#x60;.  |  |
| **content** | [**kotlin.collections.List&lt;OutputContent&gt;**](OutputContent.md) | The content of the output message.  |  |
| **status** | [**inline**](#Status) | The status of the item. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, or &#x60;incomplete&#x60;. Populated when items are returned via API.  |  |
| **queries** | **kotlin.collections.List&lt;kotlin.String&gt;** | The queries used to search for files.  |  |
| **callId** | **kotlin.String** | An identifier used when responding to the tool call with output.  |  |
| **name** | **kotlin.String** | The name of the function to run.  |  |
| **arguments** | **kotlin.String** | A JSON string of the arguments to pass to the function.  |  |
| **action** | [**ComputerAction**](ComputerAction.md) |  |  |
| **pendingSafetyChecks** | [**kotlin.collections.List&lt;ComputerToolCallSafetyCheck&gt;**](ComputerToolCallSafetyCheck.md) | The pending safety checks for the computer call.  |  |
| **summary** | [**kotlin.collections.List&lt;ReasoningItemSummaryInner&gt;**](ReasoningItemSummaryInner.md) | Reasoning text contents.  |  |
| **results** | [**kotlin.collections.List&lt;FileSearchToolCallResultsInner&gt;**](FileSearchToolCallResultsInner.md) | The results of the file search tool call.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | message, file_search_call, function_call, web_search_call, computer_call, reasoning |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | assistant |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, completed, incomplete |




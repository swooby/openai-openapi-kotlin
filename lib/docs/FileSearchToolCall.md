
# FileSearchToolCall

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The unique ID of the file search tool call.  |  |
| **type** | [**inline**](#Type) | The type of the file search tool call. Always &#x60;file_search_call&#x60;.  |  |
| **status** | [**inline**](#Status) | The status of the file search tool call. One of &#x60;in_progress&#x60;,  &#x60;searching&#x60;, &#x60;incomplete&#x60; or &#x60;failed&#x60;,  |  |
| **queries** | **kotlin.collections.List&lt;kotlin.String&gt;** | The queries used to search for files.  |  |
| **results** | [**kotlin.collections.List&lt;FileSearchToolCallResultsInner&gt;**](FileSearchToolCallResultsInner.md) | The results of the file search tool call.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | file_search_call |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, searching, completed, incomplete, failed |




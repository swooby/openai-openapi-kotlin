
# CodeInterpreterToolCall

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The unique ID of the code interpreter tool call.  |  |
| **type** | [**inline**](#Type) | The type of the code interpreter tool call. Always &#x60;code_interpreter_call&#x60;.  |  |
| **code** | **kotlin.String** | The code to run.  |  |
| **status** | [**inline**](#Status) | The status of the code interpreter tool call.  |  |
| **results** | [**kotlin.collections.List&lt;CodeInterpreterToolOutput&gt;**](CodeInterpreterToolOutput.md) | The results of the code interpreter tool call.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | code_interpreter_call |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, interpreting, completed |




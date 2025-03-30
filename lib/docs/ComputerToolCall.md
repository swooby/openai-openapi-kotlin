
# ComputerToolCall

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the computer call. Always &#x60;computer_call&#x60;. |  |
| **id** | **kotlin.String** | The unique ID of the computer call. |  |
| **callId** | **kotlin.String** | An identifier used when responding to the tool call with output.  |  |
| **action** | [**ComputerAction**](ComputerAction.md) |  |  |
| **pendingSafetyChecks** | [**kotlin.collections.List&lt;ComputerToolCallSafetyCheck&gt;**](ComputerToolCallSafetyCheck.md) | The pending safety checks for the computer call.  |  |
| **status** | [**inline**](#Status) | The status of the item. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, or &#x60;incomplete&#x60;. Populated when items are returned via API.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | computer_call |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, completed, incomplete |




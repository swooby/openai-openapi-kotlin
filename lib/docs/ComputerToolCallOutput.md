
# ComputerToolCallOutput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the computer tool call output. Always &#x60;computer_call_output&#x60;.  |  |
| **callId** | **kotlin.String** | The ID of the computer tool call that produced the output.  |  |
| **output** | [**ComputerScreenshotImage**](ComputerScreenshotImage.md) |  |  |
| **id** | **kotlin.String** | The ID of the computer tool call output.  |  [optional] |
| **acknowledgedSafetyChecks** | [**kotlin.collections.List&lt;ComputerToolCallSafetyCheck&gt;**](ComputerToolCallSafetyCheck.md) | The safety checks reported by the API that have been acknowledged by the  developer.  |  [optional] |
| **status** | [**inline**](#Status) | The status of the message input. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, or &#x60;incomplete&#x60;. Populated when input items are returned via API.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | computer_call_output |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, completed, incomplete |




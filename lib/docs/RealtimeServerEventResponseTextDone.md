
# RealtimeServerEventResponseTextDone

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;response.text.done&#x60;. |  |
| **responseId** | **kotlin.String** | The ID of the response. |  |
| **itemId** | **kotlin.String** | The ID of the item. |  |
| **outputIndex** | **kotlin.Int** | The index of the output item in the response. |  |
| **contentIndex** | **kotlin.Int** | The index of the content part in the item&#39;s content array. |  |
| **text** | **kotlin.String** | The final text content. |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | response.text.done |




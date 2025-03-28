
# ResponseTextDeltaEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the event. Always &#x60;response.output_text.delta&#x60;.  |  |
| **itemId** | **kotlin.String** | The ID of the output item that the text delta was added to.  |  |
| **outputIndex** | **kotlin.Int** | The index of the output item that the text delta was added to.  |  |
| **contentIndex** | **kotlin.Int** | The index of the content part that the text delta was added to.  |  |
| **delta** | **kotlin.String** | The text delta that was added.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | response.output_text.delta |




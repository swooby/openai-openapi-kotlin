
# OutputMessage

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The unique ID of the output message.  |  |
| **type** | [**inline**](#Type) | The type of the output message. Always &#x60;message&#x60;.  |  |
| **role** | [**inline**](#Role) | The role of the output message. Always &#x60;assistant&#x60;.  |  |
| **content** | [**kotlin.collections.List&lt;OutputContent&gt;**](OutputContent.md) | The content of the output message.  |  |
| **status** | [**inline**](#Status) | The status of the message input. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, or &#x60;incomplete&#x60;. Populated when input items are returned via API.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | message |


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




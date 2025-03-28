
# InputItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **role** | [**inline**](#Role) | The role of the message input. One of &#x60;user&#x60;, &#x60;assistant&#x60;, &#x60;system&#x60;, or &#x60;developer&#x60;.  |  |
| **content** | [**EasyInputMessageContent**](EasyInputMessageContent.md) |  |  |
| **type** | [**inline**](#Type) | The type of the message input. Always &#x60;message&#x60;.  |  |
| **id** | **kotlin.String** | The ID of the item to reference.  |  |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | user, assistant, system, developer |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | message, item_reference |




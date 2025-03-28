
# InputMessageResource

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **role** | [**inline**](#Role) | The role of the message input. One of &#x60;user&#x60;, &#x60;system&#x60;, or &#x60;developer&#x60;.  |  |
| **content** | [**kotlin.collections.List&lt;InputContent&gt;**](InputContent.md) | A list of one or many input items to the model, containing different content  types.  |  |
| **id** | **kotlin.String** | The unique ID of the message input.  |  |
| **type** | [**inline**](#Type) | The type of the message input. Always set to &#x60;message&#x60;.  |  [optional] |
| **status** | [**inline**](#Status) | The status of item. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, or &#x60;incomplete&#x60;. Populated when items are returned via API.  |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | user, system, developer |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | message |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, completed, incomplete |




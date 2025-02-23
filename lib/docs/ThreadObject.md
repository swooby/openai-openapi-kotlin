
# ThreadObject

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;thread&#x60;. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the thread was created. |  |
| **toolResources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  |  |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | thread |




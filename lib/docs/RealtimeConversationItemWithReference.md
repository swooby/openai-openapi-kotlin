
# RealtimeConversationItemWithReference

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | For an item of type (&#x60;message&#x60; | &#x60;function_call&#x60; | &#x60;function_call_output&#x60;) this field allows the client to assign the unique ID of the item. It is not required because the server will generate one if not provided.  For an item of type &#x60;item_reference&#x60;, this field is required and is a reference to any item that has previously existed in the conversation.  |  [optional] |
| **type** | [**inline**](#Type) | The type of the item (&#x60;message&#x60;, &#x60;function_call&#x60;, &#x60;function_call_output&#x60;, &#x60;item_reference&#x60;).  |  [optional] |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | Identifier for the API object being returned - always &#x60;realtime.item&#x60;.  |  [optional] |
| **status** | [**inline**](#Status) | The status of the item (&#x60;completed&#x60;, &#x60;incomplete&#x60;). These have no effect  on the conversation, but are accepted for consistency with the  &#x60;conversation.item.created&#x60; event.  |  [optional] |
| **role** | [**inline**](#Role) | The role of the message sender (&#x60;user&#x60;, &#x60;assistant&#x60;, &#x60;system&#x60;), only  applicable for &#x60;message&#x60; items.  |  [optional] |
| **content** | [**kotlin.collections.List&lt;RealtimeConversationItemContentInner&gt;**](RealtimeConversationItemContentInner.md) | The content of the message, applicable for &#x60;message&#x60; items.  - Message items of role &#x60;system&#x60; support only &#x60;input_text&#x60; content - Message items of role &#x60;user&#x60; support &#x60;input_text&#x60; and &#x60;input_audio&#x60;    content - Message items of role &#x60;assistant&#x60; support &#x60;text&#x60; content.  |  [optional] |
| **callId** | **kotlin.String** | The ID of the function call (for &#x60;function_call&#x60; and  &#x60;function_call_output&#x60; items). If passed on a &#x60;function_call_output&#x60;  item, the server will check that a &#x60;function_call&#x60; item with the same  ID exists in the conversation history.  |  [optional] |
| **name** | **kotlin.String** | The name of the function being called (for &#x60;function_call&#x60; items).  |  [optional] |
| **arguments** | **kotlin.String** | The arguments of the function call (for &#x60;function_call&#x60; items).  |  [optional] |
| **output** | **kotlin.String** | The output of the function call (for &#x60;function_call_output&#x60; items).  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | message, function_call, function_call_output |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | realtime.item |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | completed, incomplete |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | user, assistant, system |





# ReasoningItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the object. Always &#x60;reasoning&#x60;.  |  |
| **id** | **kotlin.String** | The unique identifier of the reasoning content.  |  |
| **summary** | [**kotlin.collections.List&lt;ReasoningItemSummaryInner&gt;**](ReasoningItemSummaryInner.md) | Reasoning text contents.  |  |
| **status** | [**inline**](#Status) | The status of the item. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, or &#x60;incomplete&#x60;. Populated when items are returned via API.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | reasoning |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, completed, incomplete |




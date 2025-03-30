
# VectorStoreFileContentResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;vector_store.file_content.page&#x60; |  |
| **&#x60;data&#x60;** | [**kotlin.collections.List&lt;VectorStoreFileContentResponseDataInner&gt;**](VectorStoreFileContentResponseDataInner.md) | Parsed content of the file. |  |
| **hasMore** | **kotlin.Boolean** | Indicates if there are more content pages to fetch. |  |
| **nextPage** | **kotlin.String** | The token for the next page, if any. |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | vector_store.file_content.page |




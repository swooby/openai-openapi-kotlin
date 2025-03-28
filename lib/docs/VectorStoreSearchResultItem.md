
# VectorStoreSearchResultItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String** | The ID of the vector store file. |  |
| **filename** | **kotlin.String** | The name of the vector store file. |  |
| **score** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The similarity score for the result. |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, VectorStoreFileAttributesValue&gt;**](VectorStoreFileAttributesValue.md) | Set of 16 key-value pairs that can be attached to an object. This can be  useful for storing additional information about the object in a structured  format, and querying for objects via API or the dashboard. Keys are strings  with a maximum length of 64 characters. Values are strings with a maximum  length of 512 characters, booleans, or numbers.  |  |
| **content** | [**kotlin.collections.List&lt;VectorStoreSearchResultContentObject&gt;**](VectorStoreSearchResultContentObject.md) | Content chunks from the file. |  |




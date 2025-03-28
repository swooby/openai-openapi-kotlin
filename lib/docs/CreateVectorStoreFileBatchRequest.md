
# CreateVectorStoreFileBatchRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. |  |
| **chunkingStrategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  |  [optional] |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, VectorStoreFileAttributesValue&gt;**](VectorStoreFileAttributesValue.md) | Set of 16 key-value pairs that can be attached to an object. This can be  useful for storing additional information about the object in a structured  format, and querying for objects via API or the dashboard. Keys are strings  with a maximum length of 64 characters. Values are strings with a maximum  length of 512 characters, booleans, or numbers.  |  [optional] |




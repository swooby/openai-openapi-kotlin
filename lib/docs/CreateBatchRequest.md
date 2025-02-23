
# CreateBatchRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **inputFileId** | **kotlin.String** | The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  |  |
| **endpoint** | [**inline**](#Endpoint) | The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. |  |
| **completionWindow** | [**inline**](#CompletionWindow) | The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported. |  |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  |  [optional] |


<a id="Endpoint"></a>
## Enum: endpoint
| Name | Value |
| ---- | ----- |
| endpoint | /v1/chat/completions, /v1/embeddings, /v1/completions |


<a id="CompletionWindow"></a>
## Enum: completion_window
| Name | Value |
| ---- | ----- |
| completionWindow | 24h |




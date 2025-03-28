
# Annotation

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the file citation. Always &#x60;file_citation&#x60;.  |  |
| **index** | **kotlin.Int** | The index of the file in the list of files.  |  |
| **fileId** | **kotlin.String** | The ID of the file.  |  |
| **url** | **kotlin.String** | The URL of the web resource.  |  |
| **title** | **kotlin.String** | The title of the web resource.  |  |
| **startIndex** | **kotlin.Int** | The index of the first character of the URL citation in the message.  |  |
| **endIndex** | **kotlin.Int** | The index of the last character of the URL citation in the message.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | file_citation, url_citation, file_path |




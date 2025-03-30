
# WebSearchToolUserLocation

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of location approximation. Always &#x60;approximate&#x60;.  |  |
| **country** | **kotlin.String** | The two-letter  [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1) of the user, e.g. &#x60;US&#x60;.  |  [optional] |
| **region** | **kotlin.String** | Free text input for the region of the user, e.g. &#x60;California&#x60;.  |  [optional] |
| **city** | **kotlin.String** | Free text input for the city of the user, e.g. &#x60;San Francisco&#x60;.  |  [optional] |
| **timezone** | **kotlin.String** | The [IANA timezone](https://timeapi.io/documentation/iana-timezones)  of the user, e.g. &#x60;America/Los_Angeles&#x60;.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | approximate |




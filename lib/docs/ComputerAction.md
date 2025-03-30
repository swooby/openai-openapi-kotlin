
# ComputerAction

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | Specifies the event type. For a click action, this property is  always set to &#x60;click&#x60;.  |  |
| **button** | [**inline**](#Button) | Indicates which mouse button was pressed during the click. One of &#x60;left&#x60;, &#x60;right&#x60;, &#x60;wheel&#x60;, &#x60;back&#x60;, or &#x60;forward&#x60;.  |  |
| **x** | **kotlin.Int** | The x-coordinate where the scroll occurred.  |  |
| **y** | **kotlin.Int** | The y-coordinate where the scroll occurred.  |  |
| **path** | [**kotlin.collections.List&lt;Coordinate&gt;**](Coordinate.md) | An array of coordinates representing the path of the drag action. Coordinates will appear as an array of objects, eg &#x60;&#x60;&#x60; [   { x: 100, y: 200 },   { x: 200, y: 300 } ] &#x60;&#x60;&#x60;  |  |
| **propertyKeys** | **kotlin.collections.List&lt;kotlin.String&gt;** | The combination of keys the model is requesting to be pressed. This is an array of strings, each representing a key.  |  |
| **scrollX** | **kotlin.Int** | The horizontal scroll distance.  |  |
| **scrollY** | **kotlin.Int** | The vertical scroll distance.  |  |
| **text** | **kotlin.String** | The text to type.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | click, double_click, drag, keypress, move, screenshot, scroll, type, wait |


<a id="Button"></a>
## Enum: button
| Name | Value |
| ---- | ----- |
| button | left, right, wheel, back, forward |




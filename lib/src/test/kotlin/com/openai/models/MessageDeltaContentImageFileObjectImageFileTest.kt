/**
 * Please note: This class is auto generated by OpenAPI Generator
 * (https://openapi-generator.tech). Do not edit this file manually.
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package com.openai.models

import io.kotlintest.specs.ShouldSpec

class MessageDeltaContentImageFileObjectImageFileTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // MessageDeltaContentImageFileObjectImageFile
        // val modelInstance = MessageDeltaContentImageFileObjectImageFile()

        // to test the property `fileId` - The [File](/docs/api-reference/files)
        // ID of the image in the message content. Set `purpose=\"vision\"` when
        // uploading the File if you need to later display the file content.
        should("test fileId") {
            // uncomment below to test the property
            // modelInstance.fileId shouldBe ("TODO")
        }

        // to test the property `detail` - Specifies the detail level of the
        // image if specified by the user. `low` uses fewer tokens, you can opt
        // in to high resolution using `high`.
        should("test detail") {
            // uncomment below to test the property
            // modelInstance.detail shouldBe ("TODO")
        }
    }
}

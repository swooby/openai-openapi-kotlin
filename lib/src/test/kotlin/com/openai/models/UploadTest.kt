/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.openai.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import com.openai.models.Upload
import com.openai.models.OpenAIFile

class UploadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of Upload
        //val modelInstance = Upload()

        // to test the property `id` - The Upload unique identifier, which can be referenced in API endpoints.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds) for when the Upload was created.
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `filename` - The name of the file to be uploaded.
        should("test filename") {
            // uncomment below to test the property
            //modelInstance.filename shouldBe ("TODO")
        }

        // to test the property `bytes` - The intended number of bytes to be uploaded.
        should("test bytes") {
            // uncomment below to test the property
            //modelInstance.bytes shouldBe ("TODO")
        }

        // to test the property `purpose` - The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
        should("test purpose") {
            // uncomment below to test the property
            //modelInstance.purpose shouldBe ("TODO")
        }

        // to test the property `status` - The status of the Upload.
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `expiresAt` - The Unix timestamp (in seconds) for when the Upload was created.
        should("test expiresAt") {
            // uncomment below to test the property
            //modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always \"upload\".
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `file`
        should("test file") {
            // uncomment below to test the property
            //modelInstance.file shouldBe ("TODO")
        }

    }
}

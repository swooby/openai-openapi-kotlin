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

class UploadFileTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UploadFile
        // val modelInstance = UploadFile()

        // to test the property `id` - The file identifier, which can be
        // referenced in the API endpoints.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `bytes` - The size of the file, in bytes.
        should("test bytes") {
            // uncomment below to test the property
            // modelInstance.bytes shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds)
        // for when the file was created.
        should("test createdAt") {
            // uncomment below to test the property
            // modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `filename` - The name of the file.
        should("test filename") {
            // uncomment below to test the property
            // modelInstance.filename shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always
        // `file`.
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `purpose` - The intended purpose of the file.
        // Supported values are `assistants`, `assistants_output`, `batch`,
        // `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
        should("test purpose") {
            // uncomment below to test the property
            // modelInstance.purpose shouldBe ("TODO")
        }

        // to test the property `status` - Deprecated. The current status of the
        // file, which can be either `uploaded`, `processed`, or `error`.
        should("test status") {
            // uncomment below to test the property
            // modelInstance.status shouldBe ("TODO")
        }

        // to test the property `statusDetails` - Deprecated. For details on why
        // a fine-tuning training file failed validation, see the `error` field
        // on `fine_tuning.job`.
        should("test statusDetails") {
            // uncomment below to test the property
            // modelInstance.statusDetails shouldBe ("TODO")
        }
    }
}

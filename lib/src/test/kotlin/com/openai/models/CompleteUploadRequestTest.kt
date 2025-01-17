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

import com.openai.models.CompleteUploadRequest

class CompleteUploadRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CompleteUploadRequest
        //val modelInstance = CompleteUploadRequest()

        // to test the property `partIds` - The ordered list of Part IDs. 
        should("test partIds") {
            // uncomment below to test the property
            //modelInstance.partIds shouldBe ("TODO")
        }

        // to test the property `md5` - The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
        should("test md5") {
            // uncomment below to test the property
            //modelInstance.md5 shouldBe ("TODO")
        }

    }
}
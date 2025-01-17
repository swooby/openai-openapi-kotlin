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

import com.openai.models.VectorStoreObjectFileCounts

class VectorStoreObjectFileCountsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of VectorStoreObjectFileCounts
        //val modelInstance = VectorStoreObjectFileCounts()

        // to test the property `inProgress` - The number of files that are currently being processed.
        should("test inProgress") {
            // uncomment below to test the property
            //modelInstance.inProgress shouldBe ("TODO")
        }

        // to test the property `completed` - The number of files that have been successfully processed.
        should("test completed") {
            // uncomment below to test the property
            //modelInstance.completed shouldBe ("TODO")
        }

        // to test the property `failed` - The number of files that have failed to process.
        should("test failed") {
            // uncomment below to test the property
            //modelInstance.failed shouldBe ("TODO")
        }

        // to test the property `cancelled` - The number of files that were cancelled.
        should("test cancelled") {
            // uncomment below to test the property
            //modelInstance.cancelled shouldBe ("TODO")
        }

        // to test the property `total` - The total number of files.
        should("test total") {
            // uncomment below to test the property
            //modelInstance.total shouldBe ("TODO")
        }

    }
}
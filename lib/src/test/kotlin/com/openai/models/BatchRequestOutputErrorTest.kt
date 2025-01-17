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

import com.openai.models.BatchRequestOutputError

class BatchRequestOutputErrorTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BatchRequestOutputError
        //val modelInstance = BatchRequestOutputError()

        // to test the property `code` - A machine-readable error code.
        should("test code") {
            // uncomment below to test the property
            //modelInstance.code shouldBe ("TODO")
        }

        // to test the property `message` - A human-readable error message.
        should("test message") {
            // uncomment below to test the property
            //modelInstance.message shouldBe ("TODO")
        }

    }
}
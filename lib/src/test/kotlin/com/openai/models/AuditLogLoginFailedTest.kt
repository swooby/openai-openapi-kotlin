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

import com.openai.models.AuditLogLoginFailed

class AuditLogLoginFailedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AuditLogLoginFailed
        //val modelInstance = AuditLogLoginFailed()

        // to test the property `errorCode` - The error code of the failure.
        should("test errorCode") {
            // uncomment below to test the property
            //modelInstance.errorCode shouldBe ("TODO")
        }

        // to test the property `errorMessage` - The error message of the failure.
        should("test errorMessage") {
            // uncomment below to test the property
            //modelInstance.errorMessage shouldBe ("TODO")
        }

    }
}

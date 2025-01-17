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

import com.openai.models.AuditLogApiKeyUpdated
import com.openai.models.AuditLogApiKeyUpdatedChangesRequested

class AuditLogApiKeyUpdatedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AuditLogApiKeyUpdated
        //val modelInstance = AuditLogApiKeyUpdated()

        // to test the property `id` - The tracking ID of the API key.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `changesRequested`
        should("test changesRequested") {
            // uncomment below to test the property
            //modelInstance.changesRequested shouldBe ("TODO")
        }

    }
}
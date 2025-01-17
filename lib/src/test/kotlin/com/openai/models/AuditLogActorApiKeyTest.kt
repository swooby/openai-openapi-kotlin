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

import com.openai.models.AuditLogActorApiKey
import com.openai.models.AuditLogActorServiceAccount
import com.openai.models.AuditLogActorUser

class AuditLogActorApiKeyTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AuditLogActorApiKey
        //val modelInstance = AuditLogActorApiKey()

        // to test the property `id` - The tracking id of the API key.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `type` - The type of API key. Can be either `user` or `service_account`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `user`
        should("test user") {
            // uncomment below to test the property
            //modelInstance.user shouldBe ("TODO")
        }

        // to test the property `serviceAccount`
        should("test serviceAccount") {
            // uncomment below to test the property
            //modelInstance.serviceAccount shouldBe ("TODO")
        }

    }
}
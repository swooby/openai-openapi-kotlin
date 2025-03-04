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

class InviteRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of InviteRequest
        // val modelInstance = InviteRequest()

        // to test the property `email` - Send an email to this address
        should("test email") {
            // uncomment below to test the property
            // modelInstance.email shouldBe ("TODO")
        }

        // to test the property `role` - `owner` or `reader`
        should("test role") {
            // uncomment below to test the property
            // modelInstance.role shouldBe ("TODO")
        }

        // to test the property `projects` - An array of projects to which
        // membership is granted at the same time the org invite is accepted. If
        // omitted, the user will be invited to the default project for
        // compatibility with legacy behavior.
        should("test projects") {
            // uncomment below to test the property
            // modelInstance.projects shouldBe ("TODO")
        }
    }
}

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

class InviteTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of Invite
        // val modelInstance = Invite()

        // to test the property ``object`` - The object type, which is always
        // `organization.invite`
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `id` - The identifier, which can be referenced
        // in API endpoints
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `email` - The email address of the individual to
        // whom the invite was sent
        should("test email") {
            // uncomment below to test the property
            // modelInstance.email shouldBe ("TODO")
        }

        // to test the property `role` - `owner` or `reader`
        should("test role") {
            // uncomment below to test the property
            // modelInstance.role shouldBe ("TODO")
        }

        // to test the property `status` - `accepted`,`expired`, or `pending`
        should("test status") {
            // uncomment below to test the property
            // modelInstance.status shouldBe ("TODO")
        }

        // to test the property `invitedAt` - The Unix timestamp (in seconds) of
        // when the invite was sent.
        should("test invitedAt") {
            // uncomment below to test the property
            // modelInstance.invitedAt shouldBe ("TODO")
        }

        // to test the property `expiresAt` - The Unix timestamp (in seconds) of
        // when the invite expires.
        should("test expiresAt") {
            // uncomment below to test the property
            // modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property `acceptedAt` - The Unix timestamp (in seconds)
        // of when the invite was accepted.
        should("test acceptedAt") {
            // uncomment below to test the property
            // modelInstance.acceptedAt shouldBe ("TODO")
        }

        // to test the property `projects` - The projects that were granted
        // membership upon acceptance of the invite.
        should("test projects") {
            // uncomment below to test the property
            // modelInstance.projects shouldBe ("TODO")
        }
    }
}

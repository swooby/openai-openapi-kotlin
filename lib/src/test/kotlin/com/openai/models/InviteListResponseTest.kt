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

import com.openai.models.InviteListResponse
import com.openai.models.Invite

class InviteListResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of InviteListResponse
        //val modelInstance = InviteListResponse()

        // to test the property ``object`` - The object type, which is always `list`
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property ``data``
        should("test `data`") {
            // uncomment below to test the property
            //modelInstance.`data` shouldBe ("TODO")
        }

        // to test the property `firstId` - The first `invite_id` in the retrieved `list`
        should("test firstId") {
            // uncomment below to test the property
            //modelInstance.firstId shouldBe ("TODO")
        }

        // to test the property `lastId` - The last `invite_id` in the retrieved `list`
        should("test lastId") {
            // uncomment below to test the property
            //modelInstance.lastId shouldBe ("TODO")
        }

        // to test the property `hasMore` - The `has_more` property is used for pagination to indicate there are additional results.
        should("test hasMore") {
            // uncomment below to test the property
            //modelInstance.hasMore shouldBe ("TODO")
        }

    }
}
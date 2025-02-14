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

import com.openai.models.RealtimeResponse
import com.openai.models.RealtimeConversationItem
import com.openai.models.RealtimeResponseStatusDetails
import com.openai.models.RealtimeResponseUsage

class RealtimeResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeResponse
        //val modelInstance = RealtimeResponse()

        // to test the property `id` - The unique ID of the response.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, must be `realtime.response`.
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `status` - The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). 
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `statusDetails`
        should("test statusDetails") {
            // uncomment below to test the property
            //modelInstance.statusDetails shouldBe ("TODO")
        }

        // to test the property `output` - The list of output items generated by the response.
        should("test output") {
            // uncomment below to test the property
            //modelInstance.output shouldBe ("TODO")
        }

        // to test the property `metadata` - Developer-provided string key-value pairs associated with this response. 
        should("test metadata") {
            // uncomment below to test the property
            //modelInstance.metadata shouldBe ("TODO")
        }

        // to test the property `usage`
        should("test usage") {
            // uncomment below to test the property
            //modelInstance.usage shouldBe ("TODO")
        }

    }
}

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

class RealtimeServerEventRateLimitsUpdatedRateLimitsInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeServerEventRateLimitsUpdatedRateLimitsInner
        // val modelInstance =
        // RealtimeServerEventRateLimitsUpdatedRateLimitsInner()

        // to test the property `name` - The name of the rate limit (`requests`,
        // `tokens`).
        should("test name") {
            // uncomment below to test the property
            // modelInstance.name shouldBe ("TODO")
        }

        // to test the property `limit` - The maximum allowed value for the rate
        // limit.
        should("test limit") {
            // uncomment below to test the property
            // modelInstance.limit shouldBe ("TODO")
        }

        // to test the property `remaining` - The remaining value before the
        // limit is reached.
        should("test remaining") {
            // uncomment below to test the property
            // modelInstance.remaining shouldBe ("TODO")
        }

        // to test the property `resetSeconds` - Seconds until the rate limit
        // resets.
        should("test resetSeconds") {
            // uncomment below to test the property
            // modelInstance.resetSeconds shouldBe ("TODO")
        }
    }
}

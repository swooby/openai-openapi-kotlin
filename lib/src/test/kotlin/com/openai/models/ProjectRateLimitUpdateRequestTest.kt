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

import com.openai.models.ProjectRateLimitUpdateRequest

class ProjectRateLimitUpdateRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProjectRateLimitUpdateRequest
        //val modelInstance = ProjectRateLimitUpdateRequest()

        // to test the property `maxRequestsPer1Minute` - The maximum requests per minute.
        should("test maxRequestsPer1Minute") {
            // uncomment below to test the property
            //modelInstance.maxRequestsPer1Minute shouldBe ("TODO")
        }

        // to test the property `maxTokensPer1Minute` - The maximum tokens per minute.
        should("test maxTokensPer1Minute") {
            // uncomment below to test the property
            //modelInstance.maxTokensPer1Minute shouldBe ("TODO")
        }

        // to test the property `maxImagesPer1Minute` - The maximum images per minute. Only relevant for certain models.
        should("test maxImagesPer1Minute") {
            // uncomment below to test the property
            //modelInstance.maxImagesPer1Minute shouldBe ("TODO")
        }

        // to test the property `maxAudioMegabytesPer1Minute` - The maximum audio megabytes per minute. Only relevant for certain models.
        should("test maxAudioMegabytesPer1Minute") {
            // uncomment below to test the property
            //modelInstance.maxAudioMegabytesPer1Minute shouldBe ("TODO")
        }

        // to test the property `maxRequestsPer1Day` - The maximum requests per day. Only relevant for certain models.
        should("test maxRequestsPer1Day") {
            // uncomment below to test the property
            //modelInstance.maxRequestsPer1Day shouldBe ("TODO")
        }

        // to test the property `batch1DayMaxInputTokens` - The maximum batch input tokens per day. Only relevant for certain models.
        should("test batch1DayMaxInputTokens") {
            // uncomment below to test the property
            //modelInstance.batch1DayMaxInputTokens shouldBe ("TODO")
        }

    }
}

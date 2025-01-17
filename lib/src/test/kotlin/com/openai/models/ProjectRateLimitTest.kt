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

import com.openai.models.ProjectRateLimit

class ProjectRateLimitTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProjectRateLimit
        //val modelInstance = ProjectRateLimit()

        // to test the property ``object`` - The object type, which is always `project.rate_limit`
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `id` - The identifier, which can be referenced in API endpoints.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `model` - The model this rate limit applies to.
        should("test model") {
            // uncomment below to test the property
            //modelInstance.model shouldBe ("TODO")
        }

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

        // to test the property `maxImagesPer1Minute` - The maximum images per minute. Only present for relevant models.
        should("test maxImagesPer1Minute") {
            // uncomment below to test the property
            //modelInstance.maxImagesPer1Minute shouldBe ("TODO")
        }

        // to test the property `maxAudioMegabytesPer1Minute` - The maximum audio megabytes per minute. Only present for relevant models.
        should("test maxAudioMegabytesPer1Minute") {
            // uncomment below to test the property
            //modelInstance.maxAudioMegabytesPer1Minute shouldBe ("TODO")
        }

        // to test the property `maxRequestsPer1Day` - The maximum requests per day. Only present for relevant models.
        should("test maxRequestsPer1Day") {
            // uncomment below to test the property
            //modelInstance.maxRequestsPer1Day shouldBe ("TODO")
        }

        // to test the property `batch1DayMaxInputTokens` - The maximum batch input tokens per day. Only present for relevant models.
        should("test batch1DayMaxInputTokens") {
            // uncomment below to test the property
            //modelInstance.batch1DayMaxInputTokens shouldBe ("TODO")
        }

    }
}
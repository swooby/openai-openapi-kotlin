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

import com.openai.models.RealtimeSessionTurnDetection

class RealtimeSessionCreateRequestTurnDetectionTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeSessionCreateRequestTurnDetection
        //val modelInstance = RealtimeSessionCreateRequestTurnDetection()

        // to test the property `type` - Type of turn detection, only `server_vad` is currently supported. 
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `threshold` - Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
        should("test threshold") {
            // uncomment below to test the property
            //modelInstance.threshold shouldBe ("TODO")
        }

        // to test the property `prefixPaddingMs` - Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
        should("test prefixPaddingMs") {
            // uncomment below to test the property
            //modelInstance.prefixPaddingMs shouldBe ("TODO")
        }

        // to test the property `silenceDurationMs` - Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
        should("test silenceDurationMs") {
            // uncomment below to test the property
            //modelInstance.silenceDurationMs shouldBe ("TODO")
        }

        // to test the property `createResponse` - Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
        should("test createResponse") {
            // uncomment below to test the property
            //modelInstance.createResponse shouldBe ("TODO")
        }

    }
}

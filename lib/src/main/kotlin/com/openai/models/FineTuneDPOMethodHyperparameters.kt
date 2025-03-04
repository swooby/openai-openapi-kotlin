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

import com.squareup.moshi.Json

/**
 * The hyperparameters used for the fine-tuning job.
 *
 * @param beta
 * @param batchSize
 * @param learningRateMultiplier
 * @param nEpochs
 */
data class FineTuneDPOMethodHyperparameters(
    @Json(name = "beta") val beta: FineTuneDPOMethodHyperparametersBeta? = null,
    @Json(name = "batch_size")
    val batchSize: FineTuneDPOMethodHyperparametersBatchSize? = null,
    @Json(name = "learning_rate_multiplier")
    val learningRateMultiplier:
        FineTuneDPOMethodHyperparametersLearningRateMultiplier? =
        null,
    @Json(name = "n_epochs")
    val nEpochs: FineTuneDPOMethodHyperparametersNEpochs? = null,
) {}

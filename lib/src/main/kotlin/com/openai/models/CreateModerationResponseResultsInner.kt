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

import com.openai.models.CreateModerationResponseResultsInnerCategories
import com.openai.models.CreateModerationResponseResultsInnerCategoryAppliedInputTypes
import com.openai.models.CreateModerationResponseResultsInnerCategoryScores

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param flagged Whether any of the below categories are flagged.
 * @param categories 
 * @param categoryScores 
 * @param categoryAppliedInputTypes 
 */


data class CreateModerationResponseResultsInner (

    /* Whether any of the below categories are flagged. */
    @Json(name = "flagged")
    val flagged: kotlin.Boolean,

    @Json(name = "categories")
    val categories: CreateModerationResponseResultsInnerCategories,

    @Json(name = "category_scores")
    val categoryScores: CreateModerationResponseResultsInnerCategoryScores,

    @Json(name = "category_applied_input_types")
    val categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes

) {


}

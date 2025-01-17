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

package com.openai.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import com.openai.apis.UsersApi
import com.openai.models.User
import com.openai.models.UserDeleteResponse
import com.openai.models.UserListResponse
import com.openai.models.UserRoleUpdateRequest

class UsersApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsersApi
        //val apiInstance = UsersApi()

        // to test deleteUser
        should("test deleteUser") {
            // uncomment below to test deleteUser
            //val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
            //val result : UserDeleteResponse = apiInstance.deleteUser(userId)
            //result shouldBe ("TODO")
        }

        // to test listUsers
        should("test listUsers") {
            // uncomment below to test listUsers
            //val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
            //val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
            //val result : UserListResponse = apiInstance.listUsers(limit, after)
            //result shouldBe ("TODO")
        }

        // to test modifyUser
        should("test modifyUser") {
            // uncomment below to test modifyUser
            //val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
            //val userRoleUpdateRequest : UserRoleUpdateRequest =  // UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.
            //val result : User = apiInstance.modifyUser(userId, userRoleUpdateRequest)
            //result shouldBe ("TODO")
        }

        // to test retrieveUser
        should("test retrieveUser") {
            // uncomment below to test retrieveUser
            //val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
            //val result : User = apiInstance.retrieveUser(userId)
            //result shouldBe ("TODO")
        }

    }
}

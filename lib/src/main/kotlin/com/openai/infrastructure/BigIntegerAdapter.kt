package com.openai.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.math.BigInteger

/**
 * This Adapter was obviously added because...
 *
 * ```
 * Platform class java.math.BigDecimal requires explicit JsonAdapter to be registered
 * ```
 *
 * However, the original `fun toJson(value: BigDecimal): String` implementation
 * returns a number as a string that gets serialized with quotes, which OpenAI
 * complains about:
 * ```
 * --> POST https://api.openai.com/v1/realtime/sessions
 * Content-Length: 720
 * Content-Type: application/json
 * Accept: application/json
 * ...
 * {...,"temperature":"0.800000011920928955078125"}
 * --> END POST (720-byte body)
 * <-- 400 https://api.openai.com/v1/realtime/sessions (470ms)
 * ...
 * {
 *   "error": {
 *     "message": "Invalid type for 'temperature': expected a decimal, but got a string instead.",
 *     "type": "invalid_request_error",
 *     "param": "temperature",
 *     "code": "invalid_type"
 *   }
 * }
 * <-- END HTTP (208-byte body)
 * ```
 *
 * Changing this to return Int causes OpenAI to stop complaining.
 */
class BigIntegerAdapter {
    /*
    @ToJson
    fun toJson(value: BigInteger): String {
        return value.toString()
    }
    */

    @ToJson
    fun toJson(value: BigInteger): Int {
        return value.toInt()
    }

    @FromJson
    fun fromJson(value: String): BigInteger {
        return BigInteger(value)
    }
}

package com.example.moshipractice

import android.util.Log
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val moshi = Moshi.Builder().build()
    val jsonAdapter = moshi.adapter<User>(User::class.java)

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun exampleSerialization() {
        val user = User("renaldi", "ansan", 70f, 20, true)

        val json = jsonAdapter.toJson(user)
        println(json)
    }

    @Test
    fun exampleDeserialization() {
        val json = "{\"age\":20,\"city\":\"ansan\",\"isActive\":true,\"name\":\"renaldi\",\"weight\":70.0}"

        val user = jsonAdapter.fromJson(json)
        println(user)

        val user2 = user
        val json2 = jsonAdapter.toJsonValue(user2)
        println(json2)
    }
}
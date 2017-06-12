package com.aykuttasil.kotlinexamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class KotlinSingleton : AppCompatActivity() {

    // object ile belirtilen blok java daki static yapısına benzer ve singleton bir yapıdıdadır
    object Helper {
        fun logInfo(info: String) {
            Log.i("Kotlin", info)
        }

        fun logError(error: Exception) {
            Log.e("Kotlin", "Error", error)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_singleton)

        val info = "kotlin"
        Helper.logInfo(info)

        Helper.logError(Exception("exception"))


    }
}

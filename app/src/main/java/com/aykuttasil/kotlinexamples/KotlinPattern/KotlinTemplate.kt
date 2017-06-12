package com.aykuttasil.kotlinexamples.KotlinPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.aykuttasil.kotlinexamples.R
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import java.util.concurrent.TimeUnit

class KotlinTemplate : AppCompatActivity() {

    fun execute(task: () -> Unit) {
        val startTime = System.currentTimeMillis() //"beforeWork()"
        task()
        println("Work took ${System.currentTimeMillis() - startTime} millis") //"afterWork()"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_template)

        execute {
            kotlinx.coroutines.experimental.async(UI) {
                delay(1, TimeUnit.SECONDS)
                println("I'm working here after one second!")
            }
            println("I'm working here!")
        }
    }
}

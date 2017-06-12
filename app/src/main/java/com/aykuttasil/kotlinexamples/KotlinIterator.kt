package com.aykuttasil.kotlinexamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class KotlinIterator : AppCompatActivity() {

    class Sentence(val words: List<String>)

    operator fun Sentence.iterator(): Iterator<String> = words.iterator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_iterator)

        val list = listOf<String>("Aykut", "Asil", "Kerem")
        for (item in Sentence(list)) {
            println(item)
        }
    }
}

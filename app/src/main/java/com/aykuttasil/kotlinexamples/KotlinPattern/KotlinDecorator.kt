package com.aykuttasil.kotlinexamples.KotlinPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.aykuttasil.kotlinexamples.R

class KotlinDecorator : AppCompatActivity() {

    fun preDecorated(decorated: Text.() -> Unit): Text.() -> Unit {
        return { background { underline { decorated() } } }
    }

    class Text(val text: String) {
        fun draw() = print(text)
    }

    fun Text.underline(decorated: Text.() -> Unit) {
        print("_")
        this.decorated()
        print("_")
    }

    fun Text.background(decorated: Text.() -> Unit) {
        print("\u001B[43m")
        this.decorated()
        print("\u001B[0m")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_decorator)

        Log.i("KotlinDecorator", "onCreate")

        print("Deneme")

        Text("Aykut Asil").run {
            background {
                underline {
                    draw()
                }
            }
        }
    }

}

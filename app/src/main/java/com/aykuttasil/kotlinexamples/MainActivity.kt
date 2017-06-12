package com.aykuttasil.kotlinexamples

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.aykuttasil.kotlinexamples.KotlinPattern.KotlinDecorator
import org.jetbrains.anko.button
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.verticalLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            button("Kotlin Decorator") {
                onClick {
                    startActivity(Intent(this@MainActivity, KotlinDecorator::class.java))
                }
            }
            button("Kotlin Singleton") {
                onClick {
                    startActivity(Intent(this@MainActivity, KotlinSingleton::class.java))
                }
            }
        }
    }
}

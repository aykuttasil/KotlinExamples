package com.aykuttasil.kotlinexamples

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import com.aykuttasil.kotlinexamples.KotlinPattern.*
import org.jetbrains.anko.button
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.verticalLayout

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
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
            button("Kotlin Template") {
                onClick {
                    startActivity(Intent(this@MainActivity, KotlinTemplate::class.java))
                }
            }
            button("Kotlin Strategy") {
                onClick {
                    startActivity(Intent(this@MainActivity, KotlinStrategy::class.java))
                }
            }
            button("Kotlin Iterator") {
                onClick {
                    startActivity(Intent(this@MainActivity, KotlinIterator::class.java))
                }
            }
            button("Kotlin Sealed") {
                onClick {
                    startActivity(Intent(this@MainActivity, KotlinSealedClass::class.java))
                }
            }
        }
    }
}

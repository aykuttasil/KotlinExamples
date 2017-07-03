package com.aykuttasil.kotlinexamples.KotlinPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.aykuttasil.kotlinexamples.R

class KotlinSealedClass : AppCompatActivity() {


    // Sealed class enum yapısına benzer
    // Bir durum için belli başlı akışları bir arada tutmamızı sağlar ve bu akışların yönetimini kolaylaştırır.
    // abstract fonksiyon tanımlanamabilir
    sealed class Intention {
        object None : Intention() {
            override fun go() {

            }

            fun xyc() {

            }
        }

        object Refresh : Intention() {
            override fun go() {

            }
        }

        data class Error(val reason: String) : Intention() {
            override fun go() {

            }
        }

        data class LoadContent(val content: List<String>) : Intention() {
            override fun go() {

            }
        }

        abstract fun go()
    }

    // Enum yapısı genelde kullanımı sabit değerleri belirtmek için kullanılır
    // abstract fonksiyon tanımlanamabilir
    enum class Directions {
        TOP {
            override fun direction(x: Int, y: Int) = x to (y - 1)
        },
        LEFT {
            override fun direction(x: Int, y: Int) = (x - 1) to (y)
        },
        RIGHT {
            override fun direction(x: Int, y: Int) = (x + 1) to (y)
        },
        BOTTOM {
            override fun direction(x: Int, y: Int) = x to (y + 1)
        };

        abstract fun direction(x: Int, y: Int): Pair<Int, Int>
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_sealed_class)

        val intentation: Intention = Intention.LoadContent(emptyList())

        when (intentation) {
            Intention.None -> {
                Intention.None.apply {
                    this.xyc()
                    this.go()
                }
                println("none")
            }
            Intention.Refresh -> {
                println("refresh")
            }
        }


        var pair = Directions.TOP.direction(12, 57)

    }
}

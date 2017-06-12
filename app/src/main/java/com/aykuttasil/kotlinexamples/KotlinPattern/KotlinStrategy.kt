package com.aykuttasil.kotlinexamples.KotlinPattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.aykuttasil.kotlinexamples.R

class KotlinStrategy : AppCompatActivity() {

    class Customer(val name: String, val fee: Double, val discount: (Double) -> Double) {
        fun pricePerMonth(): Double {
            return discount(fee)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_strategy)

        val studentDiscount = { fee: Double -> fee/2 }
        val noDiscount = { fee: Double -> fee }

        val student = Customer("Ned", 10.0, studentDiscount)
        val regular = Customer("John", 10.0, noDiscount)

        println("${student.name} pays %.2f per month".format(student.pricePerMonth()))
        println("${regular.name} pays %.2f per month".format(regular.pricePerMonth()))
    }
}

package com.aykuttasil.kotlinexamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_kotlin_lambda.*
import org.jetbrains.anko.toast

class KotlinLambda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_lambda)


        ButtonPress.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                toast("Press Me Click")
            }

        })

        // Yukarıda ki yapıyı lambda kullanarak bu şekle çevirebiliriz
        ButtonPress.setOnClickListener({ v -> toast("Press Me") })

        // Eğer son parametre lambda fonksiyonu ise bu fonksiyonu parantez '()' dışına çıkarabiliriz.
        // Birden fazla parametre var ise sadece en son lambda parametresi parantez dışına çıkarılabilir.
        ButtonPress.setOnClickListener() {
            v ->
            toast("Press Me")
        }

        // Fonksiyon tek bir parametre alıyorsa ve bu lambda parametresi ise parantezler silinebilir
        ButtonPress.setOnClickListener {
            v ->
            toast("Press Me")
        }

        // Lambda fonksiyonunun tek bir parametresi var ise (v), eğer kullanılmayacaksa silinebilir
        ButtonPress.setOnClickListener {
            toast("Press Me")
        }

        // Lambda fonksiyonunun tek bir parametresi var ise ve eğer bu parametreye ihtiyaç duyulur ise
        // v-> yerine 'it' özel kelimesi kullanılabilir.
        ButtonPress.setOnClickListener {
            toast(it.javaClass.name)
        }

    }
}

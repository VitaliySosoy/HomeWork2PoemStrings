package com.example.exercise.poemstrings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
val POEM: List<String> = listOf(
    "Мы все учились понемногу",
    "Чему-нибудь и как-нибудь,",
    "Так воспитаньем, слава Богу,",
    "У нас немудрено блеснуть.",
    "Онегин был по мненью многих",
    "(Судей решительных и строгих)",
    "Учёный малый, но педант:",
    "Имел он счастливый талант",
    "Без принужденья в разговоре",
    "Коснуться до всего слегка,",
    "С ученым видом знатока",
    "Хранить молчанье в важном споре",
    "И возбуждать улыбку дам",
    "Огнем нежданных эпиграмм.")
var count: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = line(count, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        count = line(count, "onStart")
    }

    override fun onResume() {
        super.onResume()
        count = line(count, "onResume")
    }

    override fun onPause() {
        super.onPause()
        count = line(count, "onPause")
    }

    override fun onStop() {
        super.onStop()
        count = line(count, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        count = line(count, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        count = line(count, "onDestroy")
    }
}

fun line(n:Int, method: String): Int {
    var n1 = n
    if (n1 >= POEM.size) {
        Log.d(TAG, "Стихотворение начинается с начала \t $method")
        return 0
    }
    else {
        Log.d(TAG, POEM[n1] + "\t $method")
        return ++n1
    }
}
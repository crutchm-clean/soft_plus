package com.example.soft_plus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val f = File("counter")
        var count = f.readText() as Int
        if (count == 3){
            Toast.makeText(this, "опс, уже 3 холодный старт аппы", Toast.LENGTH_LONG).show()
            count = 0
            f.writeText(count.toString())
        }
    }
}
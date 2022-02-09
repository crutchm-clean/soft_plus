package com.example.soft_plus

import android.app.Application
import java.io.File
import java.io.FileReader

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val f = File("counter")
        val count = f.readText() as Int
        f.writeText((count + 1).toString())
    }


}
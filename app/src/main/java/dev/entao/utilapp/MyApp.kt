package dev.entao.utilapp

import android.app.Application
import dev.entao.kan.log.Yog

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Yog.init(this)
    }
}
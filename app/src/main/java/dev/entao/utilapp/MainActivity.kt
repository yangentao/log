package dev.entao.utilapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dev.entao.log.logd

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logd("Hello")
    }


}

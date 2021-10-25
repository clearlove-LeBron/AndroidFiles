package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ThirdActivity", "Task id is $taskId")
        setContentView(R.layout.third_layout)
        val button3:Button=findViewById(R.id.button_3)
        button3.setOnClickListener {
            ActivityCollector.finishAll()
            android.os.Process.killProcess(android.os.Process.myPid())
        }
    }
}
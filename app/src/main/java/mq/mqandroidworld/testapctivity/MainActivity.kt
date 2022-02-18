package mq.mqandroidworld.testapctivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import mq.mqandroidworld.mylibrary.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.testbt).setOnClickListener {
            val intent= Intent(this,Test::class.java)
            startActivity(intent)
        }
    }
}
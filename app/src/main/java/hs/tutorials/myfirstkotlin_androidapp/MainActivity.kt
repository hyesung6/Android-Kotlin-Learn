package hs.tutorials.myfirstkotlin_androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.Toast
import android.widget.TextView as TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1

            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hi! Are You Learning a Kotlin?", Toast.LENGTH_LONG).show()

        }
    }
}
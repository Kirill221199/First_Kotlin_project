package ru.kirill.first_kotlin_project

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun myToast(text: String) {
        val testToast: Toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        testToast.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create toast inside
        val buttonOne: Button = findViewById(R.id.button_en)
        buttonOne.setOnClickListener(View.OnClickListener {
            val testToast: Toast = Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT)
            testToast.show()
        })

        // Use top-level function
        val buttonTwo: Button = findViewById(R.id.button_rus)
        buttonTwo.setOnClickListener(View.OnClickListener {
            myToast("Привет Мир!")
        })

    }

}
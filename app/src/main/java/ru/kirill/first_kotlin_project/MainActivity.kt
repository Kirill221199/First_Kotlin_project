package ru.kirill.first_kotlin_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kirill.first_kotlin_project.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
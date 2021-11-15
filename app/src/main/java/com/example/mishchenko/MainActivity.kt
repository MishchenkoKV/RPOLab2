package com.example.mishchenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View?) {
        val snackbar = Snackbar.make(view!!, "Hello, Karyna Mishchenko", Snackbar.LENGTH_LONG)
        snackbar.setAction("Next...") {
            var editText = findViewById(R.id.editText) as EditText
            Toast.makeText(this, editText.getText(), Toast.LENGTH_LONG).show()
        }
        val sbView = snackbar.view
        snackbar.show()
    }
}
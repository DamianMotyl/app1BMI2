package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var waga =findViewById<EditText>(R.id.ET_waga);
        var wzrost = findViewById<EditText>(R.id.ET_wzrost);
        var oblicz = findViewById<Button>(R.id.BTN_oblicz);
        var listview = findViewById<Button>(R.id.BTN_list);

        oblicz.setOnClickListener {
            val wagad: Double = waga.getText().toString().toDouble();
            val wzrostd: Double = wzrost.getText().toString().toDouble() /100;
            val wynik = wagad / (wzrostd*wzrostd);

            val Naktywnosc = Intent(this, MainActivity2::class.java);
            Naktywnosc.putExtra("wynik",wynik);
            startActivity(Naktywnosc);
        }

        listview.setOnClickListener() {
            val Naktywnosc = Intent(this,MainActivity3::class.java);
            startActivity(Naktywnosc);
        }


    }
}
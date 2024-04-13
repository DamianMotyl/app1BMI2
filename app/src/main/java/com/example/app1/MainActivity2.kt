package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var wynik : Double = 0.0;
        var TV_wynik =findViewById<TextView>(R.id.TV_wynik);
        var BTN_wroc = findViewById<Button>(R.id.BTN_wroc);
        val koszyk = intent.extras;

        if (koszyk != null) {
            wynik = koszyk.getDouble("wynik");
        }
        val DC = DecimalFormat("#.##");
        TV_wynik.setText("Twoje BMI wynosi: "+DC.format(wynik));


    }
}
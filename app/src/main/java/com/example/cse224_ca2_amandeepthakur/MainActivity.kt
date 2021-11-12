package com.example.cse224_ca2_amandeepthakur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rgroup = findViewById<RadioGroup>(R.id.rgroup)

        val ch1 = findViewById<CheckBox>(R.id.checkBox1)
        val ch2 = findViewById<CheckBox>(R.id.checkBox2)
        val ch3 = findViewById<CheckBox>(R.id.checkBox3)
        val ch4 = findViewById<CheckBox>(R.id.checkBox4)
        val savebtn = findViewById<Button>(R.id.btsave)

        rgroup.setOnCheckedChangeListener { radioGroup, i ->
            var ans = findViewById<RadioButton>(i)

            if(ans!=null){
                Toast.makeText(applicationContext, ans.text.toString(), Toast.LENGTH_SHORT).show()
            }

        }

        savebtn.setOnClickListener {


            val result = StringBuilder()
            result.append("Selected Minors:\n")

            if (ch1.isChecked()) {
               result.append("\n").append(ch1.text.toString())

            }
            if (ch2.isChecked()) {
               result.append("\n").append(ch2.text.toString())
            }
            if (ch3.isChecked()) {
                result.append("\n").append(ch3.text.toString())
            }
            if (ch4.isChecked()) {
                result.append("\n").append(ch4.text.toString())
            }
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }


    }
}
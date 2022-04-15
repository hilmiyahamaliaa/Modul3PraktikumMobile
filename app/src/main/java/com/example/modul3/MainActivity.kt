package com.example.modul3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modul3.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.konversibutton.setOnClickListener{
            konversiTip() }
    }
    
    fun konversiTip() {
    val stringInTextField = binding.plainTextInputEditText.text.toString()
    val hitung = stringInTextField.toDouble()
    val selectedId = binding.radioGroup.checkedRadioButtonId
    val konversi = when (selectedId) {
        R.id.Euro -> 15620.81
        R.id.Usd -> 14366.00
        R.id.Yen -> 114.51
        else -> 03831.34
    }
        var result = konversi * hitung

        val formattedconvert = NumberFormat.getCurrencyInstance().format(result)
        binding.result.text = getString(R.string.konversi, formattedconvert)
    }
}
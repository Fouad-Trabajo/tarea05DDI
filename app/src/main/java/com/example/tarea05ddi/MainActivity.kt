package com.example.tarea05ddi

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea05ddi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttons()
        bottomNavigation()
    }

    private fun buttons() {
        /* Convertimos el texto escrito en el editText, por el usuario
             en un string y se lo asignamos a los textView */
        binding.button1.setOnClickListener {
            val textReceive = binding.editText.text.toString()
            binding.text1.text = textReceive
            binding.text2.text = textReceive
        }

        binding.button2.setOnClickListener {
            Toast.makeText(this, "Se ha pulsado el botón 2", Toast.LENGTH_LONG).show()
        }
    }

    private fun bottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    Toast.makeText(this, "Se ha pulsado el item 1", Toast.LENGTH_LONG).show()
                    true
                }

                R.id.settings -> {
                    Toast.makeText(this, "Se ha pulsado el item 2", Toast.LENGTH_LONG).show()
                    true
                }

                else -> {
                    false
                }
            }

        }


    }

}

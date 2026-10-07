package com.carita.feliz.elmapamundimultilingedelatierramedia

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.carita.feliz.elmapamundimultilingedelatierramedia.R.id.imagen1

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imagen1 = findViewById<ImageButton>(imagen1)
        imagen1.setOnClickListener {
            val bando = "Mordor"
            // Se pasan los argumentos en el orden exacto de los comodines %1$s y %2$s
            val mensajeFinal = getString(R.string.texto_internacional,bando)
            Toast.makeText(this, mensajeFinal, Toast.LENGTH_LONG).show()
        }
        val imagen2 = findViewById<ImageButton>(R.id.imagen2)
        imagen2.setOnClickListener {
            val bando = "Rohan"
            // Se pasan los argumentos en el orden exacto de los comodines %1$s y %2$s
            val mensajeFinal = getString(R.string.texto_internacional,bando)
            Toast.makeText(this, mensajeFinal, Toast.LENGTH_LONG).show()
        }
        val imagen3 = findViewById<ImageButton>(R.id.imagen3)
        imagen3.setOnClickListener {
            val bando = "Gondor"
            // Se pasan los argumentos en el orden exacto de los comodines %1$s y %2$s
            val mensajeFinal = getString(R.string.texto_internacional,bando)
            Toast.makeText(this, mensajeFinal, Toast.LENGTH_LONG).show()
        }

    }
}
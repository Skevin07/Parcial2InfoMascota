package com.unab.kevin.parcial2_infomascota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity()
{

    private lateinit var tvw_Resultado:TextView
    private lateinit var lv_animales:ListView

    private val mascota = arrayOf("Conejo", "Oso polar", "Leopardo", "Loro cabeza amarilla",
        "Cacomixtle tropical")

    private val especie = arrayOf("Canis ", " catus", "picta (pitron)",
        "Colox", "Milex")

    private val color = arrayOf("Azul", "Blanco", "Amarillo",
        "Plateado", "Morado")

    private val sexo = arrayOf("Macho", "Macho",
        "Hembra", "Macho", "Macho")

    private val peso = arrayOf("255", "200", "900",
        "455", "600")


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvw_Resultado = findViewById(R.id.tvw_Resultado)
        lv_animales = findViewById(R.id.lv_animales)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, mascota)
        lv_animales.adapter = adaptador

        lv_animales.setOnItemClickListener()
        { AdapterView, View, i, l ->
            tvw_Resultado.setText("Usted escogio: ${lv_animales.getItemAtPosition(i)}, su especie es "
                    + especie[i] + ", es de color " + color[i] + ", su sexo es " + sexo[i]
                    + " y tiene un peso de " + peso[i] + " Lb.")


        }
    }
}
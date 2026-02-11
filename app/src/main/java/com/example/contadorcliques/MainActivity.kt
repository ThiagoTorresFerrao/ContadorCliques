package com.example.contadorcliques
// Define o "endereço" do app dentro do projeto

import androidx.appcompat.app.AppCompatActivity
// Classe base para criar telas Android

import android.os.Bundle
// Usado para o ciclo de vida da Activity

import android.widget.Button
// Importa o componente Button

import android.widget.TextView
// Importa o componente TextView

class MainActivity : AppCompatActivity() {
    // Cria a tela principal do app

    var contador = 0
    // Variável que guarda o número de cliques
    // "var" significa que o valor pode mudar

    override fun onCreate(savedInstanceState: Bundle?) {
        // Função chamada quando o app abre

        super.onCreate(savedInstanceState)
        // Inicializa a Activity corretamente

        setContentView(R.layout.activity_main)
        // Conecta o Kotlin com o layout XML

        val texto = findViewById<TextView>(R.id.textContador)
        // Procura o TextView no XML usando o ID
        // Agora podemos controlar ele pelo código

        val btnClicar = findViewById<Button>(R.id.btnClicar)
        // Procura o botão "CLICAR"

        val btnResetar = findViewById<Button>(R.id.btnResetar)
        // Procura o botão "RESETAR"


        // O QUE ACONTECE QUANDO CLICA NO BOTÃO CLICAR
        btnClicar.setOnClickListener {

            contador++
            // Soma 1 ao contador
            // contador = contador + 1

            texto.text = contador.toString()
            // Converte número para texto e mostra na tela
        }


        // O QUE ACONTECE QUANDO CLICA NO BOTÃO RESETAR
        btnResetar.setOnClickListener {

            contador = 0
            // Volta o contador para zero

            texto.text = contador.toString()
            // Atualiza o texto na tela
        }
    }
}

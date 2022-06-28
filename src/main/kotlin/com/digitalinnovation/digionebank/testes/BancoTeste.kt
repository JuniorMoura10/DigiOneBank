package com.digitalinnovation.digionebank.testes

import com.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOneBank", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}
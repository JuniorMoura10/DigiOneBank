package com.digitalinnovation.digionebank

class Pessoa {

    var nome: String = "Júnior"
    var cpf: String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val junior = Pessoa()

    println(junior.pessoaInfo())

}
package Fundamentos

import java.time.LocalDate
import java.util.Date

//07. Faça um programa na Linguagem Kotlin que leia a idade
// de uma pessoa expressa em ano, mês e dia e mostre-as em dias.

fun main() {
    var anoAtual = LocalDate.now().year
    var mesAtual = LocalDate.now().monthValue
    var diaAtual = LocalDate.now().dayOfMonth

    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    println("digite o ano que voce nasceu")
    var ano = readLine().toString().toInt()

    println("digite o mes que voce nasceu")
    var mes = readLine().toString().toInt()

    println("digite o dia que voce nasceu")
    var dia = readLine().toString().toInt()

    //apresento a multiplicação dos dois numeros
    print("a sua idade em dias é: " + (((anoAtual-ano)*360)+((mesAtual-mes)*30))+(diaAtual-dia))
}
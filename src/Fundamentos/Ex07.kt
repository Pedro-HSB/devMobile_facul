package Fundamentos
//Faça um programa na Linguagem Kotlin para efetuar o cálculo
// e a apresentação do valor de uma prestação em atraso,
// utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).

fun main() {

    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    println("qual o valor da prestação")
    var valor = readLine().toString().toFloat()

    println("o valor da taxa")
    var taxa = readLine().toString().toFloat()

    println("quanto tempo em dias fico de atraso")
    var tempo = readLine().toString().toInt()

    //apresento a multiplicação dos dois numeros
    print("o valor da prestação em atraso é: " + valor+(valor * (taxa/100)*tempo))
}
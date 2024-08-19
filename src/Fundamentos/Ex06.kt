package Fundamentos
//08.	 Faça um programa na Linguagem Kotlin que calcule a área da circunferência.

fun main() {

    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    println("Digite o Raio")
    var raio = readLine().toString().toDouble()
    var pi = 3.14159

    //apresento a multiplicação dos dois numeros
    print("a area é: " + (raio*raio)*pi)
}
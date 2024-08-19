package Fundamentos
//Faça um programa na Linguagem Kotlin que receba um número e mostre o resto da divisão por 6.

fun main() {

    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    var n1 = readLine().toString().toInt()

    //apresento a multiplicação dos dois numeros
    print("o resto da divisão é: " + (n1%6))
}
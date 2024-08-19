package Fundamentos
//Faça um programa na Linguagem Kotlin para efetuar a
// leitura de um número inteiro e apresentar o resultado do quadrado desse número.

fun main() {


    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    var n1 = readLine().toString().toInt()

    //apresento a multiplicação dos dois numeros
    print("o numero ao quadrado é: " + (n1*n1))
}
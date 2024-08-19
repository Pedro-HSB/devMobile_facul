package Fundamentos
//03.	Faça um programa na Linguagem Kotlin que receba 2 números e
// apresente a multiplicação dos dois números.

fun main() {
    //criando variaveis do tipo Int
    var n1:Int
    var n2:Int

    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    n1 = readLine().toString().toInt()
    n2 = readLine().toString().toInt()

    //apresento a multiplicação dos dois numeros
    print("o Resultado da multiplicação é: " + (n1*n2))
}
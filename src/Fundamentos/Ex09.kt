package Fundamentos
//Faça um programa na Linguagem Kotlin  para ler dois valores
// inteiros para as variáveis A e B e efetuar a troca dos
// valores de forma que a variável A passe a possuir o
// valor da variável B e a variável B passe a possuir o
// valor da variável A. Apresentar os valores trocados.

fun main() {
    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    var n1 = readLine().toString().toInt()
    var n2 = readLine().toString().toInt()
    var livre = 0
    println("A = "+n1 +" / B = "+n2)
    livre = n1
    n1 = n2
    n2 = livre
    //apresento a multiplicação dos dois numeros
    println("A = "+n1 +" / B = "+n2)
}
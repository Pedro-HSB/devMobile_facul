package Fundamentos
//Faça um programa na Linguagem Kotlin que efetue a apresentação
// do valor da conversão em real de um valor lido em dólar.
// O programa deve solicitar o valor da cotação do dólar e
// também a quantidade de dólares disponível com o usuário,
// para que seja apresentado o valor em moeda brasileira.

fun main() {


    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    //println("qual o valor do real atual")
    //var realAtual = readLine().toString().toInt()

    println("qual o valor do dolar atual")
    var dolarAtual = readLine().toString().toFloat()

    println("qual o total de dolares voce possui")
    var qtdDolar = readLine().toString().toFloat()

    //apresento a multiplicação dos dois numeros
    print("o valor de dolares em real é: " + (dolarAtual*qtdDolar))
}
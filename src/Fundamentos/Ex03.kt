package Fundamentos
//Faça um programa na Linguagem Kotlin  para calcular e apresentar
// o valor do volume de uma lata de óleo, utilizando a fórmula:
// VOLUME <-- 3.14159 * RAIO2 * ALTURA.

fun main() {
    //criando variaveis do tipo Int
    var raio:Double
    var altura:Double
    var pi = 3.14159

    //pegando o valor que o usuario digitar e colocar na variavel, so acenta tipo Int
    raio = readLine().toString().toDouble()
    altura = readLine().toString().toDouble()

    //apresento a multiplicação dos dois numeros
    print("o volume de uma lata de óleo é: " + (pi*(raio*raio)*altura))
}
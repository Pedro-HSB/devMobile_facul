package Fundamentos
//Faça um programa na Linguagem Kotlin que leia uma temperatura
// em graus Fahrenheit e apresentá-la convertida em graus Celsius.
// A formula de conversão é C <-- (F - 32) * (5/9), sendo f a
// temperatura em Fahrenheit e C a temperatura em Celsius.

fun main() {
    //criando variaveis do tipo Double
    var fah:Float

    //pegando o valor que o usuario digitar e colocar na variavel, so aceita tipo Double
    fah = readLine().toString().toFloat()

    //apresento a conversão
    print("a temperatura em Celsius é: " + (fah-32) / 1.8)
}
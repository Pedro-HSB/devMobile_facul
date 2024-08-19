package Fundamentos

//04.	 Faça um programa na Linguagem Kotlin que leia uma temperatura em
// graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula
// de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit
// e C a temperatura em Celsius.
fun main() {
    //criando variaveis do tipo Double
    var n1:Double

    //pegando o valor que o usuario digitar e colocar na variavel, so aceita tipo Double
    n1 = readLine().toString().toDouble()

    //apresento a conversão
    print("a temperatura em Fahrenheit é: " + (9 * n1 + 160)/5)
}
//Ejercicio 2
/*Conversión de grados Celsius a Fahrenheit: Crea un programa que
convierta una temperatura dada en grados Celsius a Fahrenheit.*/

fun main() {
    println("Introduce la temperatura en grados Celsius:")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) {
        val fahrenheit = celsius * 9/5 + 32
        println("$celsius grados Celsius son $fahrenheit grados Fahrenheit.")
    } else {
        println("Por favor, introduce un número válido.")
    }
}
//Ejercicio 6
/*Conversión de String a Int: Lee una cadena y conviértela a un
entero, manejando posibles errores.*/

fun main() {
    println("Introduce un número entero:")
    val entrada = readLine().toString()
    try {
        val numero = entrada?.toInt()
        println("El número convertido es: $numero")
    } catch (e: NumberFormatException) {
        println("Error: La entrada no es un número entero válido.")
    }
}

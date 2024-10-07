//Ejercicio 12
/*Positivo, negativo o cero: Dado un número, indica si es positivo,
negativo o cero.*/

fun main() {
    while (true) {
        // Solicitar el número
        print("Introduce un número: ")
        val numero = readLine()?.toDoubleOrNull()

        // Verificar si el número ingresado es válido
        if (numero != null) {
            when {
                numero > 0 -> println("El número $numero es positivo.")
                numero < 0 -> println("El número $numero es negativo.")
                else -> println("El número es cero.")
            }
            break // Salir del bucle si el número es válido
        } else {
            // Si el valor ingresado no es un número, mostrar un mensaje de error
            println("Por favor, introduce un número válido.")
        }
    }
}

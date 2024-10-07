//Ejercicio 28
/*Números primos: Pide un número e indica si es primo o no*/

fun main() {
    print("Escribe un numero entero: ")
    val numero = readLine()?.toIntOrNull()

    // Verificar si el número ingresado es válido
    if (numero != null && numero > 0) {
        var esPrimo = true
        // Verificar si el número es primo
        for (i in 2 until numero) {
            if (numero % i == 0) {
                esPrimo = false // No es primo si es divisible por i
                break // Salir del bucle si se encuentra un divisor
            }
        }
        // Mostrar el resultado
        if (esPrimo && numero > 1) {
            println("$numero es un número primo.")
        } else {
            println("$numero no es un número primo.")
        }
    } else {
        // Si el valor ingresado no es válido, informar al usuario
        println("Por favor, introduce un numero entero válido mayor que 0.")
    }
}

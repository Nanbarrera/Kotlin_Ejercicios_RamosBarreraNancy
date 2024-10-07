//Ejercicio 15
/*Año bisiesto: Escribe un programa que determine si un año es bisiesto*/

fun main() {
    while (true) {
        print("Introduce un año: ")
        val año = readLine()?.toIntOrNull()
        // Verificar si el año ingresado es válido
        if (año != null) {
            // Condición para determinar si el año es bisiesto
            val esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)
            // Mostrar el resultado
            if (esBisiesto) {
                println("El año $año es bisiesto.")
            } else {
                println("El año $año no es bisiesto.")
            }
            break // Salir del bucle si se ingresó un año válido
        } else {
            // Si el valor ingresado no es válido, pedirlo de nuevo
            println("Por favor, introduce un año válido.")
        }
    }
}


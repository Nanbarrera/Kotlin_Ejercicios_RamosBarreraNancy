//Ejercicio 25
/*Factorial: Calcula el factorial de un número dado*/

fun main() {
    print("Escribe un numero para calcular su factorial: ")
    val numero = readLine()?.toIntOrNull()

    // Verificar si el número ingresado es válido
    if (numero != null && numero >= 0) {
        var factorial = 1

        // Usar un bucle for para calcular el factorial
        for (i in 1..numero) {
            factorial *= i
        }

        println("El factorial de $numero es: $factorial")
    } else {
        println("Por favor, introduce un número natural válido (0 o mayor).")
    }
}


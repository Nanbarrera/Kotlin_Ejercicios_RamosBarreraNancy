//Ejercicio 16
/*Calificación: Dada una calificación numérica (0-100), convierte y
muestra la letra correspondiente (A, B, C, D o F)*/

fun main() {
    while (true) {
        print("Escribe una calificacion entre 0 y 100: ")
        val calificacion = readLine()?.toIntOrNull()
        // Verificar si la calificación es válida
        if (calificacion != null && calificacion in 0..100) {
            // Condicional para convertir la calificación numérica a letra
            val letra = when {
                calificacion >= 90 -> "A"
                calificacion >= 80 -> "B"
                calificacion >= 70 -> "C"
                calificacion >= 60 -> "D"
                else -> "F"
            }
            // Mostrar el resultado
            println("La calificación en letra es: $letra")
            break // Salir del bucle si se ingresó una calificación válida
        } else {
            // Si el valor ingresado no es válido, pedir nuevamente el dato
            println("Por favor, introduce una calificación válida entre 0 y 100.")
        }
    }
}

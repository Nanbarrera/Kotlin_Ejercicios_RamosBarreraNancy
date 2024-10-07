//Ejercicio 20
/*Condicional anidado: Pide un número del 1 al 12 y muestra el mes
correspondiente*/

fun main() {
    while (true) {
        print("Introduce un número del 1 al 12: ")
        val mes = readLine()?.toIntOrNull()
        // Verificar si el número ingresado es válido
        if (mes != null) {
            // Determinar el mes correspondiente usando condicionales anidados
            when (mes) {
                1 -> println("Enero")
                2 -> println("Febrero")
                3 -> println("Marzo")
                4 -> println("Abril")
                5 -> println("Mayo")
                6 -> println("Junio")
                7 -> println("Julio")
                8 -> println("Agosto")
                9 -> println("Septiembre")
                10 -> println("Octubre")
                11 -> println("Noviembre")
                12 -> println("Diciembre")
                else -> println("Por favor, introduce un número entre 1 y 12.")
            }
            break // Salir del bucle si se ingresó un número válido
        } else {
            // Si el valor ingresado no es válido, pedir nuevamente el dato
            println("Por favor, introduce un número válido.")
        }
    }
}

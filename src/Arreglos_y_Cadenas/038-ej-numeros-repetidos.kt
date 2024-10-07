package Arreglos_y_Cadenas

//Ejercicio 38
/*Números repetidos en un array: Dado un array, encuentra y muestra
los números repetidos.*/

fun main() {
    // Definir un array de números enteros
    val numeros = arrayOf(1, 2, 3, 4, 2, 5, 3, 6, 7, 3)

    // Crear un mapa para contar la frecuencia de cada número
    val frecuencia = mutableMapOf<Int, Int>()

    // Recorrer el array para contar la cantidad de veces que aparece cada número
    for (num in numeros) {
        frecuencia[num] = (frecuencia[num] ?: 0) + 1
    }

    // Mostrar los números que se repiten
    println("Números repetidos:")
    for ((num, count) in frecuencia) {
        if (count > 1) {
            println("$num se repite $count veces")
        }
    }
}

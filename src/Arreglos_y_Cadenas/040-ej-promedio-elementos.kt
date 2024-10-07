package Arreglos_y_Cadenas

//Ejercicio 40
/*Promedio de elementos de un array: Crea un array de números
enteros y muestra el promedio de sus elementos*/

fun main() {
    // Definir un array de números enteros
    val numeros = arrayOf(10, 20, 30, 40, 50)

    // Calcular la suma de los elementos del array
    var suma = 0
    for (num in numeros) {
        suma += num
    }

    // Calcular el promedio dividiendo la suma entre el tamaño del array
    val promedio = suma / numeros.size

    // Mostrar el resultado
    println("El promedio de los elementos es: $promedio")
}

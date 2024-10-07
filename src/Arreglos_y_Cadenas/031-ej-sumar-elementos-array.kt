//Ejercicio 31
/*Sumar elementos de un array: Crea un array de 5 números enteros y
muestra la suma de sus elementos*/

fun main() {
    // Crear un array de 5 números enteros
    val numeros = arrayOf(10, 20, 30, 40, 50)

    var suma = 0 // Variable para almacenar la suma

    // Usar un bucle for para sumar los elementos del array
    for (numero in numeros) {
        suma += numero
    }

    // Mostrar la suma total
    println("La suma de los elementos del array es: $suma")
}

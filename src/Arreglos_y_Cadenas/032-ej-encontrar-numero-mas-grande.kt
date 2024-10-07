//Ejercicio 32
/*Encontrar el número más grande en un array: Dado un array de
números, encuentra el mayor*/

fun main() {
    // Crear un array de números enteros
    val numeros = arrayOf(15, 42, 78, 23, 56)

    // Inicializar la variable mayor con el primer elemento del array
    var mayor = numeros[0]

    // Recorrer el array y encontrar el número más grande
    for (numero in numeros) {
        if (numero > mayor) {
            mayor = numero
        }
    }

    // Mostrar el número más grande
    println("El número más grande del array es: $mayor")
}

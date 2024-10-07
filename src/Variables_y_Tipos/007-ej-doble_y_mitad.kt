//Ejercicio 7
/* Doble y mitad: Pide un número y muestra su doble y su mitad.*/

fun main() {
    var number: Double?
    do {
        print("Introduce un número:")
        number = readLine()?.toDoubleOrNull()
        if (number == null) {
            println("Por favor, introduce un número válido.")
        }
    } while (number == null)
    val doble = number * 2
    val mitad = number / 2
    println("El doble de $number es: $doble")
    println("La mitad de $number es: $mitad")
}


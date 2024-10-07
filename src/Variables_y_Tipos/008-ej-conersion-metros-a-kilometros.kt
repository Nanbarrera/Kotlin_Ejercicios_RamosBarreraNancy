//Ejercicio 8
/*Conversión de metros a kilómetros: Convierte una distancia dada
en metros a kilómetros*/

fun main() {
    print("Introduce una distancia en metros: ")
    val metros = readLine()?.toDoubleOrNull()

    if (metros != null) {
        val kilometros = metros / 1000

        println("$metros metros son equivalentes a $kilometros kilómetros.")
    } else {
        println("Por favor, introduce un número válido.")
    }
}

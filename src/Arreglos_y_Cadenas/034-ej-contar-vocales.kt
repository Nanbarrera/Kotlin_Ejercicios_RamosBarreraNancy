//Ejercicio 34
/*Contar vocales en una cadena: Dada una cadena, cuenta cuántas
vocales contiene.*/

fun main() {
    // Pedir al usuario que ingrese una cadena
    print("Escribe una cadena: ")
    val cadena = readLine()?.lowercase()

    // Verificar que la cadena no sea nula
    if (cadena != null) {
        var contadorVocales = 0

        // Recorrer cada carácter de la cadena
        for (caracter in cadena) {
            // Verificar si el carácter es una vocal
            if (caracter in "aeiou") {
                contadorVocales++
            }
        }
        // Mostrar el número de vocales
        println("La cadena contiene $contadorVocales vocales.")
    } else {
        // Mensaje en caso de que la entrada sea inválida
        println("Por favor, introduce una cadena válida.")
    }
}

package Arreglos_y_Cadenas
//Ejercicio 39
/*Mayúsculas a minúsculas: Convierte una cadena dada a
minúsculas*/

fun main() {
    // Pedir al usuario que ingrese una cadena
    print("Escribe una cadena en mayúsculas o mixtas: ")
    val cadena = readLine()

    // Verificar que la cadena no sea nula
    if (cadena != null) {
        // Convertir la cadena a minúsculas usando toLowerCase()
        val cadenaMinusculas = cadena.toLowerCase()

        // Mostrar la cadena en minúsculas
        println("La cadena en minúsculas es: $cadenaMinusculas")
    } else {
        // Mensaje en caso de que la entrada sea inválida
        println("Por favor, introduce una cadena válida.")
    }
}

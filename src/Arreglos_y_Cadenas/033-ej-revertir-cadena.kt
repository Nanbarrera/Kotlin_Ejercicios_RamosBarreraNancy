//Ejercicio 33
/*Revertir una cadena: Pide una cadena y muestra su reverso.*/

fun main() {
    // Pedir al usuario que ingrese una cadena
    print("Escribe una cadena: ")
    val cadena = readLine()

    // Verificar que la cadena no sea nula
    if (cadena != null) {
        // Usar la función reversed() para invertir la cadena
        val cadenaInvertida = cadena.reversed()

        // Mostrar la cadena invertida
        println("La cadena invertida es: $cadenaInvertida")
    } else {
        // Mensaje en caso de que la entrada sea inválida
        println("Por favor, introduce una cadena válida.")
    }
}

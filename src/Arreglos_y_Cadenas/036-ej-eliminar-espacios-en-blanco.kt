//Ejercicio 36
/*Eliminar espacios en blanco: Dada una cadena, elimina todos los
espacios en blanco.*/

fun main() {
    // Pedir al usuario que ingrese una cadena
    print("Escribe una cadena con espacios en blanco: ")
    val cadena = readLine()

    // Verificar que la cadena no sea nula
    if (cadena != null) {
        // Usar la función replace para eliminar los espacios en blanco
        val cadenaSinEspacios = cadena.replace(" ", "")

        // Mostrar la cadena sin espacios
        println("La cadena sin espacios es: $cadenaSinEspacios")
    } else {
        // Mensaje en caso de que la entrada sea inválida
        println("Por favor, introduce una cadena válida.")
    }
}

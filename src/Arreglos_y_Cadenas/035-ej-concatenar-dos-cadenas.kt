//Ejercicio 35
/**/

fun main() {
    // Pedir al usuario que ingrese la primera cadena
    print("Escribe la primera cadena: ")
    val cadena1 = readLine()

    // Pedir al usuario que ingrese la segunda cadena
    print("Escribe la segunda cadena: ")
    val cadena2 = readLine()

    // Verificar que ambas cadenas no sean nulas
    if (cadena1 != null && cadena2 != null) {
        // Concatenar las dos cadenas
        val cadenaConcatenada = cadena1 + cadena2

        // Mostrar la cadena concatenada
        println("La cadena resultante es:  $cadenaConcatenada")
    } else {
        // Mensaje en caso de que alguna entrada sea inválida
        println("Por favor, introduce cadenas válidas.")
    }
}

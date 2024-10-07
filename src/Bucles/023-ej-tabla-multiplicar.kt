//Ejercicio 23
/*Tabla de multiplicar: Pide un número e imprime su tabla de
multiplicar del 1 al 10*/

fun main() {
    print("Escribe un numero para ver su tabla de multiplicar: ")
    val numero = readLine()?.toIntOrNull()

    // Verificar si el número ingresado es válido
    if (numero != null) {
        // Imprimir la tabla de multiplicar del número ingresado
        println("Tabla de multiplicar del $numero:")
        for (i in 1..10) {
            val resultado = numero * i
            println("$numero x $i = $resultado")
        }
    } else {
        // Si el valor ingresado no es válido, informar al usuario
        println("Por favor, introduce un número válido.")
    }
}

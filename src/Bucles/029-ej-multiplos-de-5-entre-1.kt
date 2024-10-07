//Ejercicio 29
/*Múltiplos de 5 entre 1 y n: Muestra todos los múltiplos de 5 entre 1 y
un número dado n.*/

fun main() {
    // Solicitar al usuario un número entero
    print("Escribe un numero: ")
    val n = readLine()?.toIntOrNull()

    // Verificar si el número ingresado es válido
    if (n != null && n > 0) {
        println("Los múltiplos de 5 entre 1 y $n son:")

        // Usar un bucle for para encontrar y mostrar múltiplos de 5
        for (i in 1..n) {
            if (i % 5 == 0) { // Verificar si es múltiplo de 5
                println(i) // Imprimir el múltiplo de 5
            }
        }
    } else {
        println("Por favor, introduce un numero entero válido mayor que 0.")
    }
}

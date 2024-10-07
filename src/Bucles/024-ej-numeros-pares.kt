//Ejercicio 24
/*Números pares hasta n: Pide un número n y muestra todos los
números pares entre 1 y n*/

fun main() {
    print("Escribe un numero: ")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        println("Numeros pares entre 1 y $n:")

        // Usar un bucle for para encontrar y mostrar los números pares
        for (i in 1..n) {
            if (i % 2 == 0) { // Verificar si el número es par
                println(i)
            }
        }
    } else {
        // Si el valor ingresado no es válido, informar al usuario
        println("Por favor, introduce un numero válido mayor que 0.")
    }
}

//Ejercicio 26
/*Sumar dígitos de un número: Lee un número entero y calcula la
suma de sus dígitos*/

fun main() {
    print("Escribe un numero entero: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        var suma = 0
        var n = Math.abs(numero) // Usar el valor absoluto para manejar números negativos

        // Usar un bucle while para sumar los dígitos
        while (n > 0) {
            suma += n % 10 // Sumar el último dígito
            n /= 10 // Eliminar el último dígito
        }

        // Mostrar el resultado
        println("La suma de los dígitos de $numero es: $suma")
    } else {
        // Si el valor ingresado no es válido, informar al usuario
        println("Por favor, introduce un numero entero válido.")
    }
}

//Ejercicio 30
/*Invertir número: Dado un número entero, invierte el orden de sus dígitos*/

fun main() {
    print("Introduce un número entero: ")
    val numero = readLine()?.toIntOrNull()
    // Verificar si el número ingresado es válido
    if (numero != null) {
        var n = numero // Usar el número original
        var numeroInvertido = 0 // Variable para almacenar el número invertido
        val esNegativo = n < 0 // Verificar si el número es negativo

        // Usar un bucle while para invertir el número
        while (n != 0) {
            val digito = n % 10 // Obtener el último dígito
            numeroInvertido = numeroInvertido * 10 + digito // Agregar el dígito al número invertido
            n /= 10 // Eliminar el último dígito del número original
        }
        // Ajustar el signo si el número original era negativo
        if (esNegativo) {
            numeroInvertido = -numeroInvertido
        }
        // Mostrar el resultado
        println("El número invertido es: $numeroInvertido")
    } else {
        // Si el valor ingresado no es válido, informar al usuario
        println("Por favor, introduce un número entero válido.")
    }
}

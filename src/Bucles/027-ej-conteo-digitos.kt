//Ejercicio 27
/*Conteo de dígitos: Pide un número entero y cuenta cuántos dígitos
tiene*/

fun main() {
    print("Escribe un numero entero: ")
    val numero = readLine()?.toIntOrNull()

    // Verificar si el número ingresado es válido
    if (numero != null) {
        var n = Math.abs(numero) // Usar el valor absoluto para manejar números negativos
        var conteo = 0

        // Usar un bucle while para contar los dígitos
        do {
            conteo++ // Incrementar el conteo de dígitos
            n /= 10 // Eliminar el último dígito
        } while (n > 0)

        // Mostrar el resultado
        println("El numero $numero tiene $conteo digitos.")
    } else {
        // Si el valor ingresado no es válido, informar al usuario
        println("Por favor, introduce un numero entero válido.")
    }
}

//Ejercicio 11
/*Mayor de dos números: Solicita dos números y muestra el mayor de
ellos*/
fun main() {
    while (true) {
        print("Introduce el primer número: ")
        val numero1 = readLine()?.toDoubleOrNull()

        // Solicitar el segundo número
        print("Introduce el segundo número: ")
        val numero2 = readLine()?.toDoubleOrNull()

        // Verificar que ambos números sean válidos
        if (numero1 != null && numero2 != null) {
            // Comparar los dos números y mostrar el mayor
            when {
                numero1 > numero2 -> println("El número mayor es: $numero1")
                numero2 > numero1 -> println("El número mayor es: $numero2")
                else -> println("Ambos números son iguales.")
            }
            break // Salir del bucle si se ingresan números válidos
        } else {
            // Si alguno de los valores ingresados no es un número, mostrar un mensaje de error
            println("Por favor, introduce números válidos.")
        }
    }
}

fun main() {
    while (true) {
        print("Introduce el primer número: ")
        val numero1 = readLine()?.toDoubleOrNull()
        print("Introduce el segundo número: ")
        val numero2 = readLine()?.toDoubleOrNull()
        // Si alguno de los números no es válido, solicitar de nuevo
        if (numero1 == null || numero2 == null) {
            println("Por favor, introduce números válidos.")
            continue
        }
        // Solicitar la operación deseada
        print("Selecciona la operación (+, -, *, /): ")
        val operacion = readLine()
        // Ejecutar la operación elegida
        val resultado = when (operacion) {
            "+" -> numero1 + numero2
            "-" -> numero1 - numero2
            "*" -> numero1 * numero2
            "/" -> if (numero2 != 0.0) numero1 / numero2 else {
                println("No se puede dividir por cero.")
                continue
            }
            else -> {
                println("Operación no válida. Intenta de nuevo.")
                continue
            }
        }
        // Mostrar el resultado
        println("El resultado de $numero1 $operacion $numero2 es: $resultado")
        break
    }
}

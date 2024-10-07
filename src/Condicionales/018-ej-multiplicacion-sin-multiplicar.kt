//Ejercicio 18
/*Multiplicación sin multiplicar: Multiplica dos números sin usar el
operador de multiplicación*/

fun main() {
    while (true) {
        print("Ingresa el primer número: ")
        val num1 = readLine()?.toIntOrNull()

        print("Ingresa el segundo número: ")
        val num2 = readLine()?.toIntOrNull()
        // Verificar si ambos números son válidos
        if (num1 != null && num2 != null) {
            // Inicializar el resultado
            var resultado = 0
            // Multiplicar sumando num1 tantas veces como el valor de num2
            for (i in 1..kotlin.math.abs(num2)) {
                resultado += num1
            }
            // Si num2 es negativo, invertir el resultado
            if (num2 < 0) {
                resultado = -resultado
            }
            // Mostrar el resultado
            println("El resultado de la multiplicación es: $resultado")
            break // Salir del bucle si ambos números son válidos
        } else {
            // Si alguno de los valores ingresados no es válido, pedir nuevamente los datos
            println("Por favor, introduce números válidos.")
        }
    }
}

//Ejercicio 19
/*Ordenar tres números: Solicita tres números y muestra el mayor, el
intermedio y el menor*/

fun main() {
    while (true) {
        print("Escribe el primer numero: ")
        val num1 = readLine()?.toIntOrNull()

        print("Escribe el segundo numero: ")
        val num2 = readLine()?.toIntOrNull()

        print("Escribe el tercer numero: ")
        val num3 = readLine()?.toIntOrNull()
        // Verificar si todos los números son válidos
        if (num1 != null && num2 != null && num3 != null) {
            // Inicializar variables para el menor, intermedio y mayor
            val menor: Int
            val intermedio: Int
            val mayor: Int
            // Determinar el mayor, intermedio y menor usando condicionales
            if (num1 >= num2 && num1 >= num3) {
                mayor = num1
                if (num2 >= num3) {
                    intermedio = num2
                    menor = num3
                } else {
                    intermedio = num3
                    menor = num2
                }
            } else if (num2 >= num1 && num2 >= num3) {
                mayor = num2
                if (num1 >= num3) {
                    intermedio = num1
                    menor = num3
                } else {
                    intermedio = num3
                    menor = num1
                }
            } else {
                mayor = num3
                if (num1 >= num2) {
                    intermedio = num1
                    menor = num2
                } else {
                    intermedio = num2
                    menor = num1
                }
            }
            // Mostrar el resultado
            println("El numero menor es: $menor")
            println("El numero intermedio es: $intermedio")
            println("El numero mayor es: $mayor")
            break // Salir del bucle si se ingresaron números válidos
        } else {
            // Si alguno de los valores ingresados no es válido, pedir nuevamente los datos
            println("Por favor, introduce números válidos.")
        }
    }
}

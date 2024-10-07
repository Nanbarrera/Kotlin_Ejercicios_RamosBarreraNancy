//Ejercicio 22
/*Suma de los primeros n números: Dado un número n, calcula la
suma de los primeros n números naturales*/

fun main() {
    print("Escribe un numero: ")
    val n = readLine()?.toIntOrNull()
    if (n != null && n >= 0) {
        var suma = 0

        // Usar un bucle for para calcular la suma de los primeros n números
        for (i in 1..n) {
            suma += i
        }

        // Mostrar el resultado
        println("La suma de los primeros $n numeros naturales es: $suma")
    } else {
        // Si el valor ingresado no es válido, informar al usuario
        println("Por favor, introduce un numero válido.")
    }
}


//Ejercicio 14

/*Edad para votar: Pregunta la edad del usuario y muestra si puede
votar o no (mayor de 18 años*/

fun main() {
    while (true) {
        print("Coloca tu edad: ")
        val edad = readLine()?.toIntOrNull()

        // Verificar si la edad es válida
        if (edad != null) {
            // Condicional para verificar si puede votar
            if (edad >= 18) {
                println("Si puedes votar.")
            } else {
                println("No puedes votar.")
            }
            break // Salir del bucle si se ingresó una edad válida
        } else {
            // Si la entrada no es válida, pedir que se introduzca nuevamente
            println("Por favor, introduce una edad válida.")
        }
    }
}

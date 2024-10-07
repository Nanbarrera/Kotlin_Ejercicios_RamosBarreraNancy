//Ejercicio 10
/*Día de la semana: Pide un número del 1 al 7 y muestra el día de la
semana correspondiente*/
fun main() {
    var numero: Int
    while (true) {
        print("Introduce un número del 1 al 7: ")
        numero = readLine()?.toIntOrNull() ?: continue
        if (numero in 1..7) break
        println("Por favor, introduce un número válido entre 1 y 7.")
    }

    val diaSemana = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")[numero - 1]
    println("El día correspondiente al número $numero es: $diaSemana")
}

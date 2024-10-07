//Ejercicio 4
/*Intercambiar dos variables: Solicita dos variables e intercambia sus
valores.*/

fun main() {
    println("Escribe el primer valor:")
    val valor1 = readLine()

    println("Escribe el segundo valor:")
    val valor2 = readLine()

    val temp = valor1
    val nuevoValor1 = valor2
    val nuevoValor2 = temp

    println("Después de intercambiar:")
    println("Primer valor: $nuevoValor1")
    println("Segundo valor: $nuevoValor2")
}

//Ejercicio 3
/*Área de un círculo: Escribe un programa que calcule el área de un
círculo, dado su radio.*/

fun main(){
    println("Escribe el radio del circulo: ");
    val radio = readln().toDouble();
    val pi = 3.1416
    val circunferencia = 2 * pi * radio

    println("El area del circilo es: " + circunferencia)
}
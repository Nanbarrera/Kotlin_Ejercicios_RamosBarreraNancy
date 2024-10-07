//Ejercicio 9
/*Número par o impar: Lee un número y determina si es par o impar.*/

fun main(){
    println("Escribe un numero: ");
    val num = readln().toInt();

    if (num % 2 == 0) {
        println("El numero"+ num + "es par.")
    } else {
        println("El numero "+ num + " es impar.")
    }
}

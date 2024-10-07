/*Suma de dos números: Escribe un programa que solicite dos
números al usuario y muestre su suma.*/


fun main(){
    println("Escribe el primer valor: ");
    val n1 = readln().toDouble();
    println("Escribe el segundo valor:");
    val n2 = readln().toInt();

    var suma : Double = n1+n2;
    println("Resultado de la suma: $suma");
}

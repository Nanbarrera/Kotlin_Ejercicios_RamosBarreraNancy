//Ejercicio 17

/*Descuento en tienda: Pide el precio de un producto y aplica un
descuento del 20% si supera los 1000.*/

fun main() {
    while (true) {
        print("Introduce el precio del producto: ")
        val precio = readLine()?.toDoubleOrNull()

        // Verificar si el precio ingresado es válido
        if (precio != null && precio > 0) {
            // Verificar si tiene descuento
            if (precio > 1000) {
                val precioConDescuento = precio * 0.8 // Aplicar 20% de descuento
                println("Este producto tiene un descuento del 20%. ")
                println("El precio final es: $precioConDescuento")
            } else {
                println("Este producto no tiene descuento.")
                println("El precio final es: $precio")
            }
            break // Salir del bucle si se ingresó un precio válido
        } else {
            // Si el valor ingresado no es válido, pedir nuevamente el dato
            println("Por favor, introduce un precio válido.")
        }
    }
}

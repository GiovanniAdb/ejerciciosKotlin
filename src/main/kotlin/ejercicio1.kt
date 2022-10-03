fun descuentoPrecio(des: Double, precio: Double):Double{
    val descuento= precio-(precio*des)
    return descuento
}
fun ivaPrecio(iva: Double, precio: Double):Double{
    val precioIva= precio+(precio*iva)
    return precioIva
}
fun cestaCompra(productos: Array<Double>, porcentaje: Double,operacion:(Double, Double)->Double): Double{
    var totalCompra=0.0
    for (i in 0..productos.size-1){
        totalCompra+=operacion(porcentaje,productos.get(i))
    }
    return totalCompra
}

fun main(){
    val numeros = arrayOf<Double>(90.99, 10.05, 49.99);
    val entradaIva=0.15
    val entradaDescuento=0.10
    println("Con IVA: " + cestaCompra(numeros,entradaIva,::ivaPrecio))
    println("Total aplicando descuento: " + cestaCompra(numeros,entradaDescuento,::descuentoPrecio))
}
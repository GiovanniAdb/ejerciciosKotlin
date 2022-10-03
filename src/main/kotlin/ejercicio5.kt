import kotlin.math.*

fun calModulVector(a: Double, b: Double):Double{
    var calculo= sqrt(a.pow(2)+b.pow(2))
    return calculo
}

fun main(){
    val a=6.0
    val b=9.0
    println("Modulo del vector: " + calModulVector(a,b))
}
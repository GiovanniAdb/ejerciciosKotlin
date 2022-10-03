import kotlin.math.pow
import kotlin.math.sqrt

fun foundMedia(numeros: Array<Int>):Double{
    var media=0.0
    for (i in 0..numeros.size-1){
        media+=numeros.get(i)
    }
    return media/numeros.size
}

fun desviacionTipica(numeros: Array<Int>): Double{
    var suma=0.0
    var tipica=0.0
    val media=foundMedia(numeros)
    var aux=0.0
    for (i in 0..numeros.size-1){
        aux=numeros.get(i)-media
        suma+=aux.pow(2)
    }
    tipica= sqrt(suma/numeros.size)
    return tipica
}

fun devolverValoresAtipicos(numeros: Array<Int>){
    var x = 0.0
    val media = foundMedia(numeros)
    val tipica = desviacionTipica(numeros)
    for (i in 0..numeros.size-1){
        x=(numeros.get(i)-media)/tipica
        println(x)
    }
}

fun main(){
    val muestraNumeros = arrayOf<Int>(2,4,9,7,5)
    devolverValoresAtipicos(muestraNumeros)
}
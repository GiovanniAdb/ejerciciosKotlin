fun mostrar2listas(num: Array<Int> , operacion:(Int)->Int): Array<Int> {
    for (i in 0..num.size-1){
        num.set(i,operacion(num.get(i)))
        println(num.get(i))
    }
    return num
}

fun union(num: Int): Int{
    return num+10
}
fun main() {
    val conjuntoNumeros = arrayOf<Int>(10,5,4,3,1);
    mostrar2listas(conjuntoNumeros, ::union)
}
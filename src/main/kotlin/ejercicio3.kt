fun main() {
    val frase = "God Of War Ragnarok sera el mejor juego de la saga"
    println(cantidadPalabras(frase))

}

fun cantidadPalabras(frase: String): Map<String, Int> {
    val dic: MutableMap<String, Int> = mutableMapOf()
    val partes = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in partes.indices) {
        dic[partes[i]] = partes[i].length
    }
    return dic
}
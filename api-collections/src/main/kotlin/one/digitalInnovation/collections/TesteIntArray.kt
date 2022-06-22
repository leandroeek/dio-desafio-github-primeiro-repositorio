package one.digitalInnovation.collections

fun main() {
    val values = IntArray(5)
    val values2 = intArrayOf(1,2,5,8,7,9,62,0,52)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values2){
        println(valor)
    }
    println("------------------------------")
    values2.forEach {
        println(it)
    }
    println("------------------------------")
    for (index in values2.indices) {
        println("$index" + " - " + values2[index])
    }
    println("------------------------------")
    values2.sort()
    for (valor in values2) {
        println(valor)
    }
}
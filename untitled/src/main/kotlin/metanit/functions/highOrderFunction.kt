package metanit.functions


fun main() {

	displayMessage(::morning)
    displayMessage(::evening)

    numberMessage(13,4, ::sumNumber)
    numberMessage(5,5, ::multiply)
    numberMessage(10,4, ::subtractNumber)


}

fun displayMessage(mes: () -> Unit) = mes() // принимает параметр

fun morning() = println("Good Morning")
fun evening() = println("Good evening")


fun numberMessage(n1: Int, n2: Int, number: (Int,Int) -> Int){
    val result = number(n1, n2)
    println(result)
}

fun sumNumber(x: Int,y: Int): Int = x + y

fun subtractNumber(x: Int,y: Int): Int = x - y

fun multiply(x: Int, y: Int): Int = x * y
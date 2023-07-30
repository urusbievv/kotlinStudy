package metanit.functions

fun main() {

    var operation: (Int, Int) -> Int = ::sum
    val result = operation(2,5)
    println(result)

    // можем динамически менять значение

    operation = ::subtract
    val resultSubtract = operation(5,2)
    println(resultSubtract)
}
fun sum(a: Int, b: Int): Int{
    return a + b
}

fun subtract(a: Int,b:Int): Int{
    return a - b
}
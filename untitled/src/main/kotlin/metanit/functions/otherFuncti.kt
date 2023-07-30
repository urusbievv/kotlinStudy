package metanit.functions



fun main() {
    val action1 = selectAction(1)
    println(action1(8,5))    // 13

    val action2 = selectAction(2)
    println(action2(8,5))    // 3
}
fun selectAction(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата
    when(key){
        1 -> return ::sum2
        2 -> return ::subtract2
        3 -> return ::multiply2
        else -> return ::empty
    }
}
fun empty (a: Int, b: Int): Int{
    return 0
}
fun sum2(a: Int, b: Int): Int{
    return a + b
}
fun subtract2(a: Int, b: Int): Int{
    return a - b
}
fun multiply2(a: Int, b: Int): Int{
    return a * b
}
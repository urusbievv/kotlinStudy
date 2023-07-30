package metanit.functions


fun main() {


    val sum = { x: Int, y: Int -> x + y }

    oper(3, 4, ::sum)
    oper(16, 6, { x: Int, y: Int -> x - y })
    oper(20, 10, fun(x: Int, y: Int) = x * y)


    //trailing lambda
    oper(3, 4) { a: Int, b: Int -> a + b }
}


fun oper(x: Int, y: Int, op: (Int, Int) -> Int) {

    val result = op(x, y)
    println(result)
}



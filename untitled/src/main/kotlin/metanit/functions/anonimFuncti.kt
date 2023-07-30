package metanit.functions


fun main() {

    val action1 = selectAction(1)
    println(action1(2, 3))

    val action2 = selectAction(3)
    var result = action2(3, 4)
    println(result)

    val actionOther = selectAction(9)
    result = actionOther(2, 4)
    println(result)


}

fun selectActions(key: Int): (Int, Int) -> Int {

    when (key) {
        1 -> return fun(x, y) = x + y
        2 -> return fun(x: Int, y: Int): Int = x - y
        3 -> return fun(x: Int, y: Int): Int = x * y
        else -> return fun(x: Int, y: Int): Int = 0
    }
}


// через лямбду

//	fun selectActions(key: Int): (Int, Int) -> Int {
//
//    	when (key) {
//        1 -> return { x, y -> x + y }
//        2 -> return { x, y -> x - y }
//        3 -> return { x, y -> x * y }
//        else -> return { x, y -> 0 }
//   	 }
//	}


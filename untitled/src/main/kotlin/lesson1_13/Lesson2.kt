fun main() {

    val a = 6
    val b = 5
    //println(a + b)


    // без значение нельзя объявить переменную - " val c ", комбилятор не поймет какой ему нужен тип
    val c: Int // можно так, если явно указать тип


    // если в целочисленных var присутствуют дробные, будет дробным
    val numberOFInt = 10
    val numberOFFloat = 3f
    val numberOFDouble = 3.0
    //println(numberOFInt / numberOFDouble)

    // если будет float и double, будет double, больше вмещение памяти
    println(numberOFInt + numberOFFloat + numberOFDouble)

    println(numberOFInt::class) // TODO ссылку на метод или класс
    println(numberOFInt::class.simpleName) // TODO получить имя класса

    // TODO искремент
    var count = 0
    count++

    // TODO дискремент
    count--

    // сперва число ребовляется или отнимается число потом печатается
    ++count
    --count
}
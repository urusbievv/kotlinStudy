fun main() {


    // не нужно поключать Scanner
    val userAge = readLine()!!.toInt() // ввод чисел в консоль
    // (  !! - утверждает что значение не нулевое   )

    // текст из условие true пишется в resultText
    // способ без фигурных скобок
    val resultText = if (userAge >= AGE_OF_MAJ) "Показать экран со скрытным контентом"
    else if (userAge == 16 || userAge == 17) "Показать с ограниченным контентом"
    else "На главный экран"
    println(resultText)

    // как switch

//    when(userAge){
//        10 -> println("Ввели число 10")
//        20 -> println("Ввели число 20")
//        43 -> println("Ввели число 43")
//        else -> println("Нет совпадений")
//    }

    // другой способ
    val consoleNumAge = when(userAge){
        10 -> "Ввели число 10"
        20 -> {
            println("Доп действие, если ввели 20")
            "Ввели число 20"
        }
        43 -> "Ввели число 43"
        else -> "Нет совпадений"
    }
    println(consoleNumAge)
}
const val AGE_OF_MAJ = 18
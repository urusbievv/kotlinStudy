fun main() {
    // операторы сравнения
    // print(1 == 1) // true
    // print(1 != 1) // false

    // ссылочные сравнения
    //TODO  ===, !== (операторы ссылочного сравнения) как equals()

    val userAge = 42

//    val comResult = (userAge >= AGE_OF) && (userAge <= AGE_OD)

    // другой способ
    val comResult = userAge in AGE_OF..AGE_OD // диапозоне
    // !in - вне заданного диапозона
    println("Проверка возраста $comResult")

    val a = true
    val b = !a
    println(b) // false
}

const val AGE_OD = 65
const val AGE_OF = 18 // как final


package metanit.oop.enums



//enum class Day{
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//}
//
//fun main() {
//
//
//    val day = Day.SATURDAY
//    println(day)
//    println(Day.MONDAY)
//}


//  Для констант перечисления также может вызываться конструктор для их инициализации.
enum class Day(val value: Int){
    MONDAY(1),TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6),SUNDAY(7);


    fun getDuration(day: Day): Int{  // вычисляет разницу в днях между двумя днями недели
		return value - day.value;
    }
}

fun main() {


    val day = Day.MONDAY
    println(day) // 1

    // можно вызвать так
    val day2 = Day.SUNDAY
    println(day2.value) // 7

    // вычисляет разницу в днях между двумя днями недели
    println(day2.getDuration(day)) // 6


    // name: возвращает название константы в виде строки
    println(day2.name)
    // ordinal: возвращает порядковый номер константы
	println(day2.ordinal)

	// values(): возвращает массив констант текущего перечисления
    for (day2 in Day.values()) {
        print("$day2 ")
    }

    println()
    // valueOf(value: String): возвращает объект перечисления по названию константы
    println(Day.valueOf("FRIDAY"))
}


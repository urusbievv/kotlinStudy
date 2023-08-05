package metanit.oop.enums




interface Printable{
    fun printName()
}

enum class DayTime: Printable{
	DAYS{
        override val startHour: Int
            get() = 6
        override val endHour: Int
            get() = 21

        override fun printName() {
            println("День")
        }
    },
    NIGHT{
        override val startHour: Int
            get() = 22
        override val endHour: Int
            get() = 5

        override fun printName() {
            println("Ночь")
        }
    };
    abstract val startHour: Int
    abstract val endHour: Int
}

fun main() {

    DayTime.DAYS.printName() // День
    DayTime.NIGHT.printName() // Ночь

    println("Day from ${DayTime.DAYS.startHour} hour to ${DayTime.DAYS.endHour} hour")
    println("Night from ${DayTime.NIGHT.startHour} hour to ${DayTime.NIGHT.endHour} hour")


    println("Cумма = "+operate(2,6,Operation.SUM))
    println("Разность = "+operate(14,6,Operation.SUBTRACT))
    println("Произведение = "+operate(5,6,Operation.MULTIPLY))
}


// Нередко перечисления применяются для хранения состояния в программе.
// И в зависимости от этого состояния мы можем направить действие программы по определенному пути.
enum class Operation{
    SUM, SUBTRACT, MULTIPLY
}

fun operate(n1: Int, n2: Int, op: Operation): Int{

    return when(op){
        Operation.SUM -> n1 + n2
        Operation.SUBTRACT -> n1 - n2
        Operation.MULTIPLY -> n1 * n2
    }
}

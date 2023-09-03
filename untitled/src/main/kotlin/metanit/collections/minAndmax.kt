package metanit.collections


fun main() {



    val numbers = listOf(1,2,3,15,12,15,512,5,23)
    val numbers2 = listOf<Int>()
    val people = listOf("Alice", "Tom", "Sam", "Kate", "Bob")

    // если список пуст вернет null
    println(numbers.minOrNull())
    println(numbers.maxOrNull())
    println(numbers2.maxOrNull())

    // сравнивает по алфавиту
    println(people.minOrNull())
    println(people.maxOrNull())



    // Функции minByOrNull() и maxByOrNull() сравнивает в качестве параметра
    val person = listOf( Person2("Tom", 37), Person2("Bob",41), Person2("Sam", 25))
    // минимальный возраст
    val personWithMinAge = person.minByOrNull { it.age }
    println(personWithMinAge)     // Sam (25)
    // максимальный возраст
    val personWithMaxAge = person.maxByOrNull { it.age }
    println(personWithMaxAge)     // Bob (41)

    val personWithMaxName = person.maxByOrNull { it.name }
    println(personWithMaxName)

    // minOfOrNull() и maxOfOrNull() - если мы хотим получить само значение, а не объект

    val personOfAge = person.minOfOrNull { it.age }
    println(personOfAge)


    println()

	// Еще пара функций - minWithOrNull() и maxWithOrNull() в качестве параметра принимают компаратор
	// - реализацию интерфейса Comparator:
    val personal = listOf<String>("Tom","Bob","John","Jerry")
    println(personal.minWithOrNull(compareBy{ it.length}))
    println(personal.maxWithOrNull(compareBy{ it.length}))



    // И еще одна пара функций - minOfWithOrNull() и maxOfWithOrNull() принимают
	// реализацию интерфейса Comparator (первый параметр) и селектор критерия для сравнения (второй параметр):

    fun main(){

        val people2 = listOf(
            Person2("Tom", 37), Person2("Kate",29),
            Person2("Sam", 25), Person2("Alice", 33)
        )
        // самое короткое имя
        val minName = people2.minOfWithOrNull(compareBy{it.length}) { it.name }
        println(minName)     // Tom
        // самое длинное имя
        val maxName = people2.maxOfWithOrNull(compareBy{it.length}) { it.name }
        println(maxName)     // Alice
    }

    // average - среднее значение

    val numbersAve = listOf(1,2,4,4,5,12,3)
    println(numbersAve.average().toInt())

    // sum - сумма
    println(numbersAve.sum())
    println(numbers.subList(0,3)) // возвращает диапазон индексов


    // count - кол-во в списке
    val peopleOther = listOf("Tom", "Sam", "Bob", "Kate", "Alice")
    println(peopleOther.count()) // 5
    // количество строк, у которых длина равна 3
    println(peopleOther.count { it.length == 3 }) // 3


    // reduce() - сводит все значения потока к одному значению:
    val reduceNumbers = numbersAve.reduce { a, b -> a * b } // произведение всех чисел
    println(reduceNumbers) // 5760

    // другой пример со строками
    val reducePeople = peopleOther.reduce{a,b -> "$a | $b"} // соединяет строки в одну
    println(reducePeople)

    // fold() - также сводит все элементы потока в один.
	// Но в отличие от reduce в качестве первого параметра принимает начальное значение:
    val foldPeople = peopleOther.fold("All People: ") { a, b -> "$a $b" }
    println(foldPeople)


}

class Person2(val name: String, val age: Int){
    override fun toString(): String = "$name ($age)"
}
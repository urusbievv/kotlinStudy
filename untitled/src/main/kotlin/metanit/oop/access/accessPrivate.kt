package metanit.oop.access


class Person(private val name: String, _age: Int) {

    private val age = _age


    // создаем функцию через которую можно обращаться к приватным методам
    fun printPerson() {
        printName()
        printAge()
    }

    private fun printName() {
        println("Name: $name")
    }

    private fun printAge() {
        println("Age: $age")
    }
}

fun main() {

    val tom = Person("Tom", 37)
    tom.printPerson()

    // println(tom.name)   // Ошибка! - свойство name - private
    // tom.printAge()  // Ошибка! - функция printAge - private
}
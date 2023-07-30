package metanit.oop.access


open class PersonProtected(protected val name: String, private val age: Int) {

    private fun printName() {
        println(name)
    }

    private fun printAge() {
        println(age)
    }

    protected fun printPerson() {
        printName()
        printAge()
    }
}

class ClientProtected(name: String, age: Int) : PersonProtected(name, age) {

    fun printClient() {
        println("Employee $name. Full information:") // $age - не получиться вызвать так как в классе Person свойство (private)
        printPerson()
        // printName() // нельзя - printName - private
        // println("Age: $age")    // нельзя age - private
    }
}

fun main() {

    val tom = ClientProtected("Tom",32)
    tom.printClient()

    // println(tom.name)   // Ошибка! - свойство name - protected
    // tom.printPerson()  // Ошибка! - функция printPerson - protected
}
package metanit.oop.redefining

import metanit.oop.getAndSet.age


// Переопределение геттеров и сеттеров


open class PersonL(protected val name: String) {

    // указываем open, чтобы можно было переопределить свойство
    open val fullInfo: String
        get() = "Person $name - $age"

    open var age: Int = 1
        set(value) {
            if (value in 1..109)
                field = value
        }

    // переопределение функции

    open fun display() = println(fullInfo)
}


open class Employee(name: String, protected val company: String) : PersonL(name) {

    // переопределение свойств
    override val fullInfo: String
        get() = "Employee $name - $age: $company"

    override var age: Int = 18
        set(value) {
            if ((value > 17) and (value < 200))
                field = value
        }

    override fun display() = println(fullInfo)
}


// Стоит учитывать, что переопределить функции можно по всей иерархии наследования
class Manager(name: String, company: String) : Employee(name, company) {

    override val fullInfo: String
        get() = "Name: $name Company: $company  Position: Manager"

    override fun display() = println(fullInfo)

}


fun main() {


    val personL = PersonL("Tom")
    personL.age = 21
    personL.display()


    val employee = Employee("Bob", "DNS")
    employee.display()

    val manager = Manager("Alex Employee","DNS")
    manager.display()



}

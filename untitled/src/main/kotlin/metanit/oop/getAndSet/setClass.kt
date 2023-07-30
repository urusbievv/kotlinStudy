package metanit.oop.getAndSet


fun main() {

    val user = User("Akim")
    user.age = 20
    println(user.age) // 20
    user.age = -32 // не измениться (выходит из диапозона)
    println("Name user: ${user.name}, age: ${user.age} ")

    val persons = Persons("Tom", "Rider")
    println(persons.fullName)
    persons.lastName = "Brandon"
    println(persons.fullName) // измениться фамилия


    val tom = People("Tom")
    println(tom.age)
    tom.age = 37
    println(tom.age)

}

class User(val name: String) {

    var age: Int = 1
        set(value) {
            if ((value > 0) and (value < 110)) {
                field = value
            }
        }
}


// использование в get несколько свойств
class Persons(var firstName: String, var lastName: String) {

    val fullName: String
        get() = "$firstName $lastName" // можем использовать несколько свойств
}

class People(var name: String) {

    private var _age: Int = 1
    var age: Int
        set(value) {
            if((value>0) and (value<110))
                _age = value
        }
        get() = _age
}
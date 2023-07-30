package metanit.oop.constructions


class Person(_name: String, _surname: String) {


    var name: String = _name
    var age: Int = 0
    var comp: String = "Undefined"
    var balance: Int = 0

    // чтобы определить вторичный конструктор он должен вызывать первичный
    //  помощью this(указываем свойства первичного конструктора)
    constructor(_name: String, _surname: String, _age: Int) : this(_name, _surname) {
        age = _age
    }


    // можем определять больше конструкторов
    constructor(_name: String, _surname: String, _comp: String) : this(_name, _surname) {
        comp = _comp
    }


    constructor(_name: String, _surname: String, _age: Int, _balance: Int) :
            this(_name, _surname, _age) {
        balance = _balance
    }
}

fun main() {
    val person = Person("Bob", "Sterling")
    println(person.name)
    println(person.age)

    val person2 = Person("Miki", "Body", 32)
    println(person2.name)
    println(person2.age)

    var person3 = Person("Alik", "Atom", 33, 32)

}
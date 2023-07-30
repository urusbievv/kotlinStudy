package metanit.oop.Inheritance


open class Person(val name: String) {
    fun printName() = println(name)
}


// первый способ вызвать конструктор базого класса
class Client(client: String, val company: String) : Person(client) {
    fun printCompany() = println(company)
}

// второй способ вызвать Person
class Employer : Person {

    var company: String = ""

    constructor(employer: String, company: String) : super(employer){
        this.company = company
    }

    fun printCompany() = println(company)
}

fun main() {
    val client = Client("Bob", "DNS")
    client.printName()
    client.printCompany()

    val employer = Employer("Alex","Mvideo")
    employer.printName()
    employer.printCompany()
}
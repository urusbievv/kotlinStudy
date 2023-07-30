package metanit.oop.redefining


// open var age: Int - ставим open, чтобы свойство можно было переопределить
open class Animals(val name: String, open var age: Int = 2)

// override var age: Int - ставим override, чтобы переопределить свойство
open class Dog(name: String, override var age: Int = 15) : Animals(name, age)

fun main() {
    val animals = Animals("Aldos")
    println("name: ${animals.name}, age: ${animals.age}")

    val dog = Dog("Bernard")
    println("name: ${dog.name}, age: ${dog.age}")

}





package metanit.oop.anonim



// Иногда возникает необходимость создать объект некоторого класса, который больше нигде в программе не используется.
// То есть класс необходим только для создания только одного объекта. В этом случае мы, конечно, можем, как и обычно,
// определить класс и затем создать объект этого класса. Но Kotlin для таких ситуаций предоставлять
// возможность определить объект анонимного класса.



// Для определения анонимного объекта применяется ключевое слово object:

fun main() {
	// При наследовании после слова object через двоеточия указывается имя наследуемого класса или его первичный конструктор:
    val gus = object: Person("Gustavo", "Fring","Gus",35){
        val profession = "Met King"
        override fun sayHello() {
            println("Profession: $profession")
            println("Hello, my name is $name, but you can call me $nickname")
        }
    }
    println("Full name: ${gus.name} ${gus.surname}, Age: ${gus.age}")
    gus.sayHello()
}

open class Person(val name: String, val surname: String, val nickname: String, var age: Int){
    open fun sayHello(){
        println("Hello, My name is $name, but you can call me $nickname")
    }
}
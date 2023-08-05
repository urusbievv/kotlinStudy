package metanit.oop.dataClasses



fun main() {

    val alice: Person = Person("Alice", 24)
    println(alice.toString())

    // копирование данных
    val aliceOld = alice.copy(age = 70)
    println(aliceOld.toString())

    // Kotlin предоставляет для data-классов возможность декомпозиции на переменные:
    val (username, userage) = alice
    println("Name: $username  Age: $userage")
}

// с data-классами мы имеем готовую реализацию для этих функций: equals() hashCode() toString() copy()

data class Person(val name: String, val age: Int){

    // если мы хотим вручную переопределить (необязательно в data Class)
    override fun toString(): String {
        return "Name = $name, Age= $age"
    }
}

/*
TODO
  При этом чтобы класс определить как data-класс, он должен соответствовать ряду условий:

  - Первичный конструктор должен иметь как минимум один параметр

  - Все параметры первичного конструктора должны предваряться ключевыми словами val или var, то есть определять свойства

  - Свойства, которые определяются вне первичного конструктора, не используются в функциях toString, equals и hashCode

  - Класс не должен определяться с модификаторами open, abstract, sealed или inner.

 */
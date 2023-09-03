package metanit.collections

import java.lang.ref.Cleaner


// TODO filter()
// Если элемент соответствует условию, то возвращается true, а данный элемент помещается в возвращаемый набор.
// Для коллекций List и Set эта функция возвращает объект List,
// для Map - объект Map, для последовательностей Sequence - также объект Sequence:

fun main() {


    var users = listOf("Tom","Wolter","Gus","Any","Jerry")
    users = users.filter { it.length == 3 } // получаем значения с длиной в 3 символа
    println(users.joinToString())

    println()

    var sellers = listOf(
        User("Bob",43),
        User("Margo",23),
        User("Parker",27)
    )

    sellers = sellers.filter { it.age < 30 }
    println(sellers.joinToString())


    // НЕ соответствует условию, то можно применить функцию filterNot()
    var usersNot = listOf<String>("Tom","Wolter","Gus","Any","Jerry")
    usersNot = usersNot.filterNot { it.length == 3 }
    println(usersNot.joinToString())


    val people = listOf("Tom", "Mike", "Sam", "Bob", "Alice")
	// получаем значения с длиной в 3 символа на четных индексах
    val filtered = people.filterIndexed{ index, s -> (index % 2 == 0) && (s.length == 3) }
    println(filtered)  // [Tom, Sam]


    println()

    // Если коллекция/последовательность содержит элементы разных типов,
	// то с помощью функции filterIsInstance() можно извлечь элементы определенного типа. Например:
    var theBoys = listOf(
        Client("Sam"),Seller("Nick"),
        Seller("Malika"),Client("Andre"),
    )
    // получаем только элементы типа Client
    theBoys = theBoys.filterIsInstance<Client>()
    println(theBoys.joinToString(separator = "\n"))


    println()



	var peopleAll = listOf(
        User("Sam",23),null,
        null,Client("Andre"),
        null
    )
	println(peopleAll)
    // Функция filterNotNull() позволяет выфильтровать все значение, которые равны null:
    peopleAll = peopleAll.filterNotNull()
    println(peopleAll)
}


data class User(val name: String,val age: Int){
    override fun toString(): String {
        return "User(name = '$name', age = $age)"
    }
}

data class Client(val name: String) {
    override fun toString(): String {
        return "Client(name = '$name')"
    }
}

data class Seller(val name: String) {
    override fun toString(): String {
        return "Seller(name = '$name')"
    }
}
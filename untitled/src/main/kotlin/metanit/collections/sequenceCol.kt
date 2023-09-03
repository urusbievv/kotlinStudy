package metanit.collections


data class Person(val name: String,val age: Int)


fun main() {

	// применение коллекции
    var peopleList = listOf(
        Person("Tom",23),
        Person("Any",34),
        Person("Bob",37)
    )
    // filter применятся для условий коллекций
    peopleList = peopleList.filter { println("Данный список возрастов (age): ${it.age}"); it.age>30 } // (it.age>30) - задаем условие для фильтра
        .filter { println("Данный список имен (name): ${it.name}"); it.name.length == 3 } // также задаем условие

    println("Отфильтрованный список:")
    for (person in peopleList) {
        println(person)
    }

    println()

    // применение последовательности
    var peopleSequence = sequenceOf(
        Person("Tom",23),
        Person("Any",34),
        Person("Bob",37)
    )

    peopleSequence = peopleSequence.filter{println("Данный список возрастов (age): ${it.age}");it.age > 30}
    println("Между фильтром по возрасту и фильтром по имени")
    peopleSequence = peopleSequence.filter { println("Данный список имен (name): ${it.name}"); it.name.length == 3 }

    println("Отфильтрованный список:")
    for (person in peopleSequence) {
        println(person)
    }

	println()
	println("List")


    var peopleList2 = listOf(
            Person("Tom2",23),
    		Person("Any2",34),
    		Person("Bob2",37)
            )
    // Сокращение набора операций List
    peopleList2 = peopleList2.filter { println("Age filter: ${it.age}"); it.age> 30 }
        					.take(1) // выбираем один объект в результирующую коллекцию.
    for (person2 in peopleList2) {
        println(person2)
    }

    println()
    println("Sequence")

    var peopleSequence2 = sequenceOf(
        Person("Tom2",23),
        Person("Any2",34),
        Person("Bob2",37)
    )

    // Сокращение набора операций Sequence
    peopleSequence2 = peopleSequence2.filter { println("Age filter: ${it.age}"); it.age > 30 }
        							.take(1) // выбираем один объект в результирующую коллекцию.
    for (person2 in peopleSequence2) {
        println(person2)
    }
    // Этот вызов выбирает в результирующую коллекцию второй объект. Но поскольку результирующая
	// коллекция должна содержать только 1 объект, то остальные элементы последовательности нет смысла обрабатывать.

}
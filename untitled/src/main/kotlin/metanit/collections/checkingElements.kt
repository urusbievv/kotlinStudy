package metanit.collections






fun main() {

    val player = listOf("Tom", "Kate", "Sam", "Alice", "Bob")

    // Функция all проверяет, все ли элементы коллекции/последовательности соответствуют условию предиката:
    println(player.all { it.length == 3 }) // false
    println(player.all { it.length  > 2 }) // true

    // Еще одна функция - none возвращает true, если ни один из элементов НЕ соответствует условию предиката:
    println(player.none{it.length == 2}) // true
    println(player.none{it.length !=10}) // false
    println(player.none{it.length == 3}) // false

    // Функция any проверяет, соответствует хотя бы один элемент коллекции/последовательности условию предиката:
    println(player.any{it.length == 3}) // true
    println(player.any{it.length == 6}) // false


    println()


    // Также any и none, имеют версию без параметров.
    // В этом случае
	// any - возвращает true, если есть хотя бы один элемент в списке
    // none - возвращает true, если список пустой
    val hunter = listOf("Tom", "Kate", "Sam", "Alice", "Bob")
    val empty: List<String> = listOf()

    println(hunter.any()) // true
    println(empty.any()) // false

    println(hunter.none()) // false
	println(empty.none()) // true

    // Функция contains() возвращает true, если в коллекции/последовательности есть определенный элемент:
    println(hunter.contains("Sam"))     // true
    println(hunter.contains("Bill"))     // false

    // Еще одна функция - containsAll() возвращает true, если коллекция содержит все элементы другой коллекции:
    println(hunter.containsAll(listOf("Tom", "Sam")) ) // true
    println(hunter.containsAll(listOf("Tom", "Bill")) ) // false

}
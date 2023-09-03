package metanit.collections


fun main() {


    val people = listOf("Tom", "Bob", "Sam", "Kate", "Alice", "Mike")


    // Функция slice() возвращает часть коллекции, элементы которой располагаются на определенных индексах.
    println(people.slice(1..3))     // [Bob, Sam, Kate]
    println(people.slice(0..5 step 2))  // [Tom, Sam, Alice]
    println(people.slice(listOf(1, 3, 5, 1)))   // [Bob, Kate, Mike, Bob]


    //Функция take() извлекает из начала коллекции/последовательности определенное количество элементов
    // получаем три последних элемента
    println(people.takeLast(3))     // ["Kate", "Alice", "Mike"]

	// Функция takeWhile() отбирает элементы с начала коллекции/последовательности, которые соответвуют условию предиката:
    val part = people.takeWhile{it.length == 3}
    println(part)     // ["Tom", "Sam"]

    // функция takeLastWhile(), которая работает аналогичным образом, только выбирает элементы с конца списка
    val part2 = people.takeLastWhile{it.length !=3} // длина НЕ равна 3
    println(part2)     // ["Alice", "Mike"]


    // drop() позволяет пропустить определенное количество элементов в коллекции/последовательности:
    val part3 = people.drop(3) // пропускаем первые 3 элемента
    println(part3)     // [Bob, Alice, Mike]

    // dropWhile() пропускает элементы с начала коллекции/последовательности, которые соответвуют условию предиката:
    val part4 = people.dropWhile{it.length == 3}
    println(part4)     // [Kate, Bob, Alice, Mike]

    // dropLastWhile(), которая работает аналогичным образом, только пропускает элементы с конца списка
    val part5 = people.dropLastWhile{it.length !=3} // длина НЕ равна 3
    println(part5)     // ["Tom", "Sam", "Kate", "Bob"]

    // chunked() позволяет разбить коллекцию/последовательность на списки определенной длины:
    val parts = people.chunked(3)
    println(parts)     // [[Tom, Sam, Kate], [Bob, Alice, Mike]]


    // То есть сначала коллекция/последовательность разбивается на несколько списков длиной size,
    // затем каждый список передается в функцию преобразования, где на его основе можно сгенерировать новое значение.
    val parts2 = people.chunked(3){it.first()} // разделяем по три и выводим первые элементы списка
    println(parts2)     // [Tom, Bob]



}
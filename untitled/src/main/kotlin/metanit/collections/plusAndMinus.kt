package metanit.collections


fun main() {



    val people = listOf("Tom", "Bob", "Sam")

    val result1 = people.plus("Alice")
    println(result1)

    val result2 = result1 + "Jerry"
    println(result2)

    val result3 = people - "Tom"
    println(result3)

    val people2 = listOf("Ale","Renata")
    val resultAll = result3 + people2
    println(resultAll)

    // Объединение


    // Функция zip() имеет еще одну версию, которая в качестве второго параметра получает функцию преобразования,
    // применяемую к элементам коллекций/последовательностей:
    val english = listOf("red", "blue", "green")
    val russian = listOf("красный", "синий", "зеленый")
    val words = english.zip(russian)
    for(word in words)
        println("${word.first}: ${word.second}")

    // unzip, которая позволяет обратно получить две коллекции
    val wordsUn = words.unzip()
    println(wordsUn.first)
    println(wordsUn.second)


}
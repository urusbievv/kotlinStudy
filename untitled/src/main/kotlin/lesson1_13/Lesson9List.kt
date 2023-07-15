fun main() {

    val list = listOf<Int>(1,2,3,4) // незменяемый список
//    println(list.size)

    val mutableList = mutableListOf<Int>(12,3,4,56,1) // можно добавлять удалять и тд
    mutableList.add(34) // добавит к последним
    mutableList.add(3,100) // можно указывать куда именно добавлять
//    println(mutableList)

//    println(mutableList.contains(56)) // проверяет содержится ли это значение в списке

//    println(mutableList.isEmpty()) // проверяет пустой ли список true - пустой, false - нет
//    println(mutableList.isNotEmpty()) // наоборот

//    println(mutableList.indexOf(3)) // возращает индекс значения

    mutableList.sort()
//    mutableList.sortDescending()//  обратном порядке

    mutableList.forEach{
        print("$it ")
    }


    // filter - фильтрует их по условие
    val numbers = listOf(1, 2, 3, 4, 5)

// Пример 1: Использование "it" в лямбда-выражении для фильтрации четных чисел
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // Выводит [2, 4]

// Пример 2: Использование "it" в лямбда-выражении для преобразования чисел в строки
    val numberStrings = numbers.map { "Number: $it" }
    println(numberStrings) // Выводит [Number: 1, Number: 2, Number: 3, Number: 4, Number: 5]


    // map - преобразовывает числа
    val numbers2 = listOf(1, 2, 3, 4, 5)

// Преобразовать числа в их квадраты
    val squares = numbers2.map { it * it }
    println(squares) // Выводит [1, 4, 9, 16, 25]

// Преобразовать числа в строки
    val numberStrings2 = numbers2.map { it.toString() }
    println(numberStrings2) // Выводит ["1", "2", "3", "4", "5"]

}
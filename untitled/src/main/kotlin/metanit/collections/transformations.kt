package metanit.collections


// map() - преобразует данные

fun main() {

    val cars = listOf(
        Car("BMW"), Car("Toyota"), Car("Kio"), Car("Ford")
    )

    val carName = cars.map { it.name } // get name each mark cars
	println(carName)


    // Другой пример - трансформируем последовательность чисел в последовательность квадратов этих чисел:
    val numbers = listOf(3,4,5,2,16)
    val squares = numbers.map { it * it }
    println(squares)


    // mapIndexed() - также передает в функцию преобразования индекс текущего элемента:
    val carIndex = cars.mapIndexed{index, car -> "${index+1}.$car" } // index+1 - чтобы начинал с индекса 1
    println(carIndex.joinToString(separator = "\n"))



    // flatten() - позволяет преобразовать коллекцию/последовательность, которая содержит вложенные коллекции/последовательности:

	// flatten помещает все коллекции в одну
    val personal = listOf(
        listOf("Bob","Marlin"),
        listOf(Car("Audi"),Car("Benz")),
		listOf("Anita","Victor")
    )
    val all = personal.flatten()
    println(all.joinToString())


}


data class Car(val name: String)
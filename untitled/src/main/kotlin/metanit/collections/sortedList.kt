package metanit.collections


// Для сортировки коллекции/последовательности применяются функции sorted() (сортировка по возрастанию)
// и sortedDescending() (сортировка по убыванию).
//
//	Что в данном случае значит сортировка по возрастанию или убыванию? По умолчанию процесс сортировки опирается
// TODO на реализацию интерфейса Comparable, которая определяет, какой объект будет больше, а какой меньше.
// Так, для встроенных базовых типов действует следующая логика:


fun main() {

    val numbersList = listOf(44, -34, 4, 141, -13, 6, 23, 10)
    val peopleList = listOf("Tom", "Mike", "Bob", "Sam", "Alice")

    // сортировка по возрастанию
    val sortedNumber = numbersList.sorted()
    val sortedPeople = peopleList.sorted()
    println(sortedNumber)
    println(sortedPeople)

    // по убыванию
    val sortedDescNumber = numbersList.sortedDescending()
    val sortedDescPeople = peopleList.sortedDescending()
    println(sortedDescNumber)
    println(sortedDescPeople)

    // TODO Реализация интерфейса Comparable
    //
    // 	public interface Comparable<in T> {
    //    	public operator fun compareTo(other: T): Int
    //	}
    // Его функция compareTo() должна определять логику сравнения. В качестве параметра она принимает объект,
    // который сравнивается с текущим.
    //
    //В качестве результата возвращается число. Если текущий объект равен объекту other,
    // то функция должна возвратить 0. Если текущий объект больше объекта other, то возвращается
    // положительное число, если меньше - то отрицательное.
	println()

    val workers = listOf(
        Workers("Brine", 40),
        Workers("Alina", 32),
        Workers("Sam",16),
        Workers("Vika",25)
    )
    println(workers.sorted().joinToString())
    println(workers.sortedDescending().joinToString())



	//TODO Comparator

    // Если мы хотим отсортировать списки, но нам не доступен код класса, где мы могли бы использовать
    // интерфейс Comparable, либо мы хотим задать уже для существующих типов, которые уже реализуют Comparable
    // На этот случай мы используем интерфейс Comparator.

    // Его функция compare() принимает два параметра - два сравниваемых объекта и также возвращает целое число.
	//   - если первый параметр больше второго, то возвращается положительное число, если меньше - то отрицательное.
	// 	 - если объекты равно, возвращается 0.

	println()

    // Пример:

    val teachers = listOf(
        Teachers("Alex",45),
        Teachers("Bil",52),
        Teachers("Marita",34),
        Teachers("Andre",33)
    )
    val teachersComparator = Comparator { o1:Teachers, o2:Teachers -> o1.age - o2.age }

    // sortedWith - в качестве параметра принимает comparator и сортирует на его основе
    val teacherSorted = teachers.sortedWith(teachersComparator)
    println(teacherSorted.joinToString())

    // можно сократить
    val teachersSorted2 = teachers.sortedWith(compareBy{ it.age })
    println(teachersSorted2.joinToString())

    // сортируем по длине строки
    val teachersSortedNameLength = teachers.sortedWith(compareBy{ it.name.length })
    println(teachersSortedNameLength.joinToString())

	println()
    // sortedBy - по возрастанию
    // sortedByDescending - по убыванию

    // сортируем по алфавиту
    val teachersSortName = teachers.sortedBy { it.name }
    val teachersSortDescName = teachers.sortedByDescending { it.name }
    println(teachersSortName)
    println(teachersSortDescName)

    val numbers = listOf(1, 21, 32, 4, 5, 6)
    // reversed - не сортирует, а меняет порядок элементов местами по убыванию
    println(numbers.reversed())
    // shuffled - перемешивает элементы рандомно
    println(numbers.shuffled())

}




data class Teachers(val name: String,val age: Int){
    override fun toString(): String {
        return "($name, $age)"
    }
}


// Comparable
class Workers(val name: String, val age: Int) : Comparable<Workers> {

    // сравнение по имени

    // override fun compareTo(other: Workers): Int = name.compareTo(other.name)


    //сравнение по возрасту
    override fun compareTo(other: Workers): Int = this.age - other.age

    override fun toString(): String = "$name ($age)"


}


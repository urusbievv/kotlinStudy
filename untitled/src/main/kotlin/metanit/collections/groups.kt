package metanit.collections


fun main() {



    // Для группировки элементов коллекции/последовательности применяется функция TODO groupBy():

    // Обе версии в качестве параметра принимают функцию, которая определяет критерий группировки.
	// Вторая версия в дополнение принимает функцию преобразования. Результатом функции является объект Map,
	// который хранит набор групп. Ключами являются критерии группировки - ключи групп,
	// а значениями - списки List, которые соответствуют этим критериям группировки и представляют группы.

    val employees = listOf(
        Employee("Tom", "Microsoft"),
        Employee("Bob", "JetBrains"),
        Employee("Sam", "Google"),
        Employee("Alice", "Microsoft"),
        Employee("Kate", "Google")
    )

	val companies = employees.groupBy { it.company }
    println(companies)

    println()


    // перебор групп
    for (company in companies) {
        println(company.key) // name company
        // перебор list employee
        for (employee in company.value) {
            println(employee)
        }
        println() // отделяем группы
    }

	// Теперь применим другую версию функции groupBy с использованием трансформации:
    val companies2 = employees.groupBy({it.company}) { it.name }  // объект Map<String, List<String>>
	println(companies2)
    // В данном случае в качестве критерия группировки опять выступает свойство company объектов Employee ({ it.company }),
	// однако сама группа будет представлять список строк - объект List<String>, поскольку функция преобразования вытаскивает
	// значение свойства name объекта Employee: it.name
    // В этом случае override toString() не нужен


}

data class Employee(val name: String, val company: String){
    override fun toString(): String = name
}
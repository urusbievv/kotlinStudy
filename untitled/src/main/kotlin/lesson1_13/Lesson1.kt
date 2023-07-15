fun main(){

    val numberOfOrders = 42 // TODO val - неизменяемая переменная

    // в котлине не как, в java не обязательно указывать тип переменной, язык может сам понять
    val notificationText = "Какой-то текст"

    // но иногда лучше указать явно, чтобы не запутаться в своем коде
    // явно объявив переменную одного типа нельзя положить переменную другого типа
    // Это делается таким образом
    val str: String = "Тоже какой-то текст"
    val numberOFSome: Int = 43 // также Double и тд

    println(str)

    // TODO чтобы изменить (перезаписать переменную) используется var
    var nameOFPerson = "Alik"
    println("Сперва ${nameOFPerson}")
    nameOFPerson = "Petr"
    println("Изменили ${nameOFPerson}")

    // Byte - 8 bit
    // Short - 16
    // Int - 32
    // Long - 64
    // Double - 64
    // Float - 32
    // String - " "
    // Char - ' '
    // Boolean - true false
    // TODO UInt - можно объявить тип только для положительных чисел
    val unsignedNum: UInt = 21123u //
}


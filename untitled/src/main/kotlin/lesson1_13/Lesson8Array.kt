fun main(){

    // инициализация массива
    val intArray: IntArray = intArrayOf(13,31,13,5,6,1)

    // можно без указания
    val intArray2 = intArrayOf(21,213,51,2,11,24)



    var intArray3 = intArrayOf(42,21,56,1,1,2)
    intArray3 = intArrayOf(32,123,2,31)
//    println(intArray3.joinToString()) // joinToString() - объединяет элементы в строку
//    println(intArray3.joinToString(separator = " ")) // separator - если хотим поменять запятую на др элементы "пробел"
//    println(intArray3.size) // размер массивы



    val arrays: Array<String> =  arrayOf("яйцо", "курица", "рыба", "мясо")
//    println(arrays.indexOf("рыба")) // получить индекс
//    println(arrays[3]) // найти по индексу
//    arrays[1] = "зелень" // поменять значение
//    println(arrays[1])

    //
    arrays.set(0,"гречка") // изменить можно индекс и так
    arrays.get(0)

//    for(i in arrays){
//        println("Индекс ${arrays.indexOf(i) + 1}: храниться $i") // (i) + 1 начинался с 1
//
//    }

    val intArr = IntArray(10) // IntArray - указываем размер массива

    for (i in 0 until 10){
        val element = i+1
        intArr[i] = element
    }
    println(intArr.joinToString(separator = " "))
}


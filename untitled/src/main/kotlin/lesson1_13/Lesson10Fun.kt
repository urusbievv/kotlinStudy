//fun main() {
////    getName()
////    getAge()
//
//    getEmail()
//    getPassword()
//}


// как void
//fun getName(){
//    println("¬ведите им€")
//    val name = readLine()
//    println(name)
//}
//fun getAge(){
//    println("¬ведите возраст")
//    val age = readLine()!!.toInt()
//    println(age)
//}

// c возращаемым значением
//
//fun getEmail(): String? {
//    println("¬ведите email")
//    return readLine()
//}
//
//fun getPassword(): String? {
//    println("введите пароль")
//    return readLine()
//}


// —оздание функции с принимающими параметрами

fun main() {
    getName()
    getAge()
}


fun getName(): String?{
    println("¬ведите им€")
    return readLine()
}

fun getAge(): Int?{
    println("¬ведите возраст")
    val writeAge = readLine()?.toInt()
    if (writeAge != null) {
        do {
            println("—лишком большой возраст, введите еще рвз")
        }while (writeAge < 100)
    }
    return writeAge
}


//fun main() {
////    getName()
////    getAge()
//
//    getEmail()
//    getPassword()
//}


// ��� void
//fun getName(){
//    println("������� ���")
//    val name = readLine()
//    println(name)
//}
//fun getAge(){
//    println("������� �������")
//    val age = readLine()!!.toInt()
//    println(age)
//}

// c ����������� ���������
//
//fun getEmail(): String? {
//    println("������� email")
//    return readLine()
//}
//
//fun getPassword(): String? {
//    println("������� ������")
//    return readLine()
//}


// �������� ������� � ������������ �����������

fun main() {
    getName()
    getAge()
}


fun getName(): String?{
    println("������� ���")
    return readLine()
}

fun getAge(): Int?{
    println("������� �������")
    val writeAge = readLine()?.toInt()
    if (writeAge != null) {
        do {
            println("������� ������� �������, ������� ��� ���")
        }while (writeAge < 100)
    }
    return writeAge
}


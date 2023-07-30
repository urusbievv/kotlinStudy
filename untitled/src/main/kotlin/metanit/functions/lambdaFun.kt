package metanit.functions


fun main() {

    val hello = { println("Hello Kotlin") } // ����� ���������� � ����������
    hello()
    hello()


    val welcome: () -> Unit = {
        println("Welcome my room")
    }


    // ����� ��������� ��� ������� ������� ��������� ()

    { println("City") }();  // ; - ����� ��������� ����� ������
    { println("Town") }()


    val printer = { message: String -> println(message) }
    printer("Hi")
    printer("Good Bye")

    val printInt = { messageInt: Int -> println(messageInt) }
    printInt(5);

    // ��� ����������
    { message: String -> println(message) }("Welcome to Kotlin")


    val sumary = { x: Int, y: Int -> println(x + y) }
    sumary(3,4)


    val sss = { x:Int,y:Int ->
        val result = x-y
        println(result)
    }
    sss(122,2)



}
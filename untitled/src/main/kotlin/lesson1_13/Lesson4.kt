fun main() {
    // ��������� ���������
    // print(1 == 1) // true
    // print(1 != 1) // false

    // ��������� ���������
    //TODO  ===, !== (��������� ���������� ���������) ��� equals()

    val userAge = 42

//    val comResult = (userAge >= AGE_OF) && (userAge <= AGE_OD)

    // ������ ������
    val comResult = userAge in AGE_OF..AGE_OD // ���������
    // !in - ��� ��������� ���������
    println("�������� �������� $comResult")

    val a = true
    val b = !a
    println(b) // false
}

const val AGE_OD = 65
const val AGE_OF = 18 // ��� final


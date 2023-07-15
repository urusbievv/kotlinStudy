fun main() {


    // �� ����� ��������� Scanner
    val userAge = readLine()!!.toInt() // ���� ����� � �������
    // (  !! - ���������� ��� �������� �� �������   )

    // ����� �� ������� true ������� � resultText
    // ������ ��� �������� ������
    val resultText = if (userAge >= AGE_OF_MAJ) "�������� ����� �� �������� ���������"
    else if (userAge == 16 || userAge == 17) "�������� � ������������ ���������"
    else "�� ������� �����"
    println(resultText)

    // ��� switch

//    when(userAge){
//        10 -> println("����� ����� 10")
//        20 -> println("����� ����� 20")
//        43 -> println("����� ����� 43")
//        else -> println("��� ����������")
//    }

    // ������ ������
    val consoleNumAge = when(userAge){
        10 -> "����� ����� 10"
        20 -> {
            println("��� ��������, ���� ����� 20")
            "����� ����� 20"
        }
        43 -> "����� ����� 43"
        else -> "��� ����������"
    }
    println(consoleNumAge)
}
const val AGE_OF_MAJ = 18
fun main() {

    // while, do-while

    var count = 1

//    while (count > 0) {
//        println("������� ���������� ����� ${count--}")
//        Thread.sleep(1000)
//    }

    do {
        println("������� �������� ����� ${count++}")
        Thread.sleep(1000)
    } while (count <= 5)

    //      � do-while ������� �������� ���� ����� ��� �����������
}
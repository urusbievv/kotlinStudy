package lesson15

interface Movable {

    fun startEngine(){
        println("��������� �������")
    }

    fun prepareForTakeOff() // ���������� � �������
    fun prepareForLanding() // �������
}
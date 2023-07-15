package lesson14

open class SpaceShip( // open - ����� ��������
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false, // ����� ���� � �� ������������

    ) {

    fun switchToWarpMode() {
        println("������� � ����-�����")
    }

    // open ��� ����� ����� ����� ���� �������������� �����
    open fun runSystemDiagnostic() {
        println("�������� �����������")
    }



}
package lesson14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int
) : SpaceShip(name,speed,unmanned = true) {


    fun launchDrones(){
        println("$name: ����������� ����� ��������")
    }

    override fun runSystemDiagnostic() {
        // super - ���� ����� ����� ������ ���������� ����� ������������� ������
        super.runSystemDiagnostic()
        println("$name: �������� ����������� ������ � ��������")
    }
}
package lesson19

fun main() {

    // enum - ���������� ���������, �������� ��� ���������� ���-�� ��������� ���������

    // �ODO - ����� ��� �������� � ����, ���� �� �������  ������� �� ���� ������ �� ��������
    // ���� ����� �ODO
    // ����� ����� ������� ����������� ����������
    // �ODO ("�������� ����� getTree()")
    // TODO - ����� ������������ � �������� �������

    val statusServer = listOf<Int>(101,102,103)

    for (i in statusServer){
        when (i){
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(1000)
    }

    println()
//    println(Status.NEW.name) // �������� ��� ���������
//    println(Status.NEW.ordinal) // �������� ���������� ����� ���������
//    for (i in Status.values()) println(i) // �������� ������(������) enum

    println(Status.NEW.getStatusDes())
    println(Status.COOKING.getStatusDes())
    println(Status.COMPLETED.getStatusDes())


}

enum class Status(val id: Int){
    NEW(101) {
        override fun getStatusDes(): String {
            return "����� ������ � ������� ������"
        }
    },
    COOKING(102) {
        override fun getStatusDes(): String {
            return "����� ������� � ����� ����������"
        }
    },
    COMPLETED(103) {
        override fun getStatusDes(): String {
            return "����� �����, ������ �������"
        }
    },
    ERROR(0) {
        override fun getStatusDes(): String {
            return "���-�� ����� �� ���, �� ��� �����������"
        }
    };

    // ����� � ������� ������������ (enum) ����� ��������� �������
    abstract fun getStatusDes() : String
}

fun setStatus(status: Status){
    val printStatus = when(status){
        Status.NEW -> "����� ������"
        Status.COOKING -> "����� ����������"
        Status.COMPLETED -> "����� �����"
        Status.ERROR -> "������ ����������"
    }
    println(printStatus)
}
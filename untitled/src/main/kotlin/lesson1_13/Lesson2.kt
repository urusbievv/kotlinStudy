fun main() {

    val a = 6
    val b = 5
    //println(a + b)


    // ��� �������� ������ �������� ���������� - " val c ", ���������� �� ������ ����� ��� ����� ���
    val c: Int // ����� ���, ���� ���� ������� ���


    // ���� � ������������� var ������������ �������, ����� �������
    val numberOFInt = 10
    val numberOFFloat = 3f
    val numberOFDouble = 3.0
    //println(numberOFInt / numberOFDouble)

    // ���� ����� float � double, ����� double, ������ �������� ������
    println(numberOFInt + numberOFFloat + numberOFDouble)

    println(numberOFInt::class) // TODO ������ �� ����� ��� �����
    println(numberOFInt::class.simpleName) // TODO �������� ��� ������

    // TODO ���������
    var count = 0
    count++

    // TODO ����������
    count--

    // ������ ����� ����������� ��� ���������� ����� ����� ����������
    ++count
    --count
}
package lesson11

class Ingredients constructor(val name: String, val weight: Int, var count: Int){ // ��������� ����������� ��� ����� � ��������� ������ � ������ () ������� ���
    // constructor - ����� ���� �������

    // ����� ��� ���� ����� �������� ������������� ����
    // ����� �� ����������� ���������� ���� ����� ����� val ��� var � �������
//    var name = _name
//    var weight = _weight
//    var count = _count

    // ����� ���������������� ������� ������ ���-��� �������
    // ��������� ��� ��������������� ����������
    // ���� ���������� �� ������ ����� �������� ��� �� ����

    // ��� ���� ����� ����� ������� ��������������������� ��������,
    // ����� ������� ��� � ���� ������
    var isNeedToPrepare = false // ����� �������� ���� �� ���������
    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count){ // ���������� � ��������� ������������
        this.isNeedToPrepare = isNeedToPrepare // ����� ����� ���� ������ ��������
    }

    //TODO ��� �������� �������, ���� ����� �����
    // ��� �������� ��������� ����� ���� ���� ����, ������� block init
    init{
        println("���������� $name ������")
    }

    // TODO ��� ����� ���������� ����� ���� �� ����� �������� ���������� ������
    // 1 - ��������� �����������
    // 2 - ��������� ����������
    // 3 - ����� init
    // 4 - ����������� ���������� ���� � ���� ���������� ������������

    

}

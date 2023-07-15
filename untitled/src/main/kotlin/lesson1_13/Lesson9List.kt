fun main() {

    val list = listOf<Int>(1,2,3,4) // ����������� ������
//    println(list.size)

    val mutableList = mutableListOf<Int>(12,3,4,56,1) // ����� ��������� ������� � ��
    mutableList.add(34) // ������� � ���������
    mutableList.add(3,100) // ����� ��������� ���� ������ ���������
//    println(mutableList)

//    println(mutableList.contains(56)) // ��������� ���������� �� ��� �������� � ������

//    println(mutableList.isEmpty()) // ��������� ������ �� ������ true - ������, false - ���
//    println(mutableList.isNotEmpty()) // ��������

//    println(mutableList.indexOf(3)) // ��������� ������ ��������

    mutableList.sort()
//    mutableList.sortDescending()//  �������� �������

    mutableList.forEach{
        print("$it ")
    }


    // filter - ��������� �� �� �������
    val numbers = listOf(1, 2, 3, 4, 5)

// ������ 1: ������������� "it" � ������-��������� ��� ���������� ������ �����
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // ������� [2, 4]

// ������ 2: ������������� "it" � ������-��������� ��� �������������� ����� � ������
    val numberStrings = numbers.map { "Number: $it" }
    println(numberStrings) // ������� [Number: 1, Number: 2, Number: 3, Number: 4, Number: 5]


    // map - ��������������� �����
    val numbers2 = listOf(1, 2, 3, 4, 5)

// ������������� ����� � �� ��������
    val squares = numbers2.map { it * it }
    println(squares) // ������� [1, 4, 9, 16, 25]

// ������������� ����� � ������
    val numberStrings2 = numbers2.map { it.toString() }
    println(numberStrings2) // ������� ["1", "2", "3", "4", "5"]

}
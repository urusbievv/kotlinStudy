package lesson20

import java.util.Calendar

fun main() {

//    ������-������� - ��� ��������� �������, ������� ����� ���� ������������ � �������� �������� ��� ��������
//    � ������ ������� � �������� ���������.
//    ��� �������� ����������� � ���������� ������ ����������� �������.

    // ��������� ������� ����������� ��� fun, �� ��� ��������


    val calendar: Calendar = Calendar.getInstance() // ������� ���������

    // ���������� �������� ���-�� ���� � ���� � �������� ��� ������� ����
    // ��������� ����� ����� ���������� �� ������� ������
    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

//    println(getDaysToEndYear.invoke()) // invoke - �������
    // ����� �������� � ���
    println("Days:")
    println(getDaysToEndYear())

    // ����������� ����, ������� �� �������� ������ � ������������
    println("Days convert in Millis:")
    // Unit - ������� ������ �� ����������
    // (Int) - ������� ���������
    val convertEndDaysToMillis: (Int) -> Unit = fun(endDays: Int) = println("convert anonim fun: ${1000 * 60 * 60 * 24 * endDays}")
    convertEndDaysToMillis(getDaysToEndYear())

    val convertLambda = { endDays: Int -> // endDays ��� it - ����������� ��������
        println("convert lambda : ${1000 * 60 * 60 * 24 * endDays}")
    }
    convertLambda(getDaysToEndYear())

//TODO ������ �����:
//     1) ����������� ����������,
//     2) ���������� � ���������� �� ������� �������.
//     �� ���� ����� �������� � ������ ������� �����-�� ���������, ����� ��� �������� ����������� ������ ������� ������
//     return � ������� �� �����.
//     ����� ��� ����� � ��������� �������.

//     ������ - ����� ������� �� ��������� ������� � ������� ��� ��������.
//     ������� ����� ���������� ��������� � �������� � ��� ���,
//     ������� ��� �������� ����������� � ������� "fun()",
//     � ������ � ������� ���������� ���� � �������� ������ "() ->"
    println()

    // �������� ������
    //TODO Unit - ������ �� ����������
    //TODO (Int) - ����������� ��������
    val printStringWithLambda: (Int) -> Unit = {
        println("print string with lambda $it") // it - �������� ����������� ��������, ������ ���� ��������
    }
    printStringWithLambda(4343);  // � ������� ��������� ����������� �������� (Int)
    // ; - ������ ����� �� ��������� � ������ �������

    // ������ ������� ����� �������� ����� ������� ����, �������� ������
    {it: Int -> println("print string with lambdaShort $it") }(4343)



    //  ������ ������


    val printStringWithLambda2: (Int) -> String = { answer: Int -> // answer ������ it
        "print string with lambda String $answer"
    }
    println(printStringWithLambda2(321));

    // �������� ������
    println({it: Int -> "print string with lambdaShort String $it"}(321))




}
fun main(){

    // ������������� �������
    val intArray: IntArray = intArrayOf(13,31,13,5,6,1)

    // ����� ��� ��������
    val intArray2 = intArrayOf(21,213,51,2,11,24)



    var intArray3 = intArrayOf(42,21,56,1,1,2)
    intArray3 = intArrayOf(32,123,2,31)
//    println(intArray3.joinToString()) // joinToString() - ���������� �������� � ������
//    println(intArray3.joinToString(separator = " ")) // separator - ���� ����� �������� ������� �� �� �������� "������"
//    println(intArray3.size) // ������ �������



    val arrays: Array<String> =  arrayOf("����", "������", "����", "����")
//    println(arrays.indexOf("����")) // �������� ������
//    println(arrays[3]) // ����� �� �������
//    arrays[1] = "������" // �������� ��������
//    println(arrays[1])

    //
    arrays.set(0,"������") // �������� ����� ������ � ���
    arrays.get(0)

//    for(i in arrays){
//        println("������ ${arrays.indexOf(i) + 1}: ��������� $i") // (i) + 1 ��������� � 1
//
//    }

    val intArr = IntArray(10) // IntArray - ��������� ������ �������

    for (i in 0 until 10){
        val element = i+1
        intArr[i] = element
    }
    println(intArr.joinToString(separator = " "))
}


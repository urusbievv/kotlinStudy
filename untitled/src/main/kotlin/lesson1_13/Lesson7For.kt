fun main() {

    // �����


    val range1 = 45..70
    val range2 = 32 until 70 // ������� � 70
    val rangeBack = 67 downTo 13 //  �������� �������
    val range3: CharRange = 'a'..'z'
    val range4: ClosedRange<Double> = 23.1..50.21
    // TODO � for ����� ���������� Int � Char �����
    // TODO � Char ����� �������� ������-��� ��� ������� ���������� � ����� �����
    val range5 = 43..65 step 3 // TODO step - �� ������� ������


    // ��������� ���� �� ����� � ������ ���������
    val a = 54 in range1
    val b = 54 !in range1
//    println(a)
//    println(b)


//    print("������� ����� �������: ")
//    val timeInput = readLine()!!.toInt()
//
//    for (i in timeInput downTo 1 ){
//        println("����� ���������� �����: $i")
//        Thread.sleep(1000)
//        if(i == 1){
//            println("����� �����!!!")
//        }
//    }

//    val range= 45..70
//    for(i in range step 5)
//        println(i)


    for (i in 5 downTo  1 ){
        if(i == 3){
//            println("������������ ����� \"����������\" ")
//            break
            println("i == 3 �� ����� �����������")
            continue // ��������� ���� � ������������ �����,
                    // ����� ���� ���������� �������� ����
//            return // ��������� ���������� ������� � ������� ��� ���������
        }
        println("������� ���������� �����: $i")
        Thread.sleep(1000)
        if(i == 1){
            println("����� �����!!!")
        }
    }

    println()

    val nums1 = 34
    val nums2 = 43

    for(i in nums1..nums2){
        print("$i ")
    }


}
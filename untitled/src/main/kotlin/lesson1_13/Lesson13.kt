fun main() {


    val qwerty: Array<String?> = arrayOf("fdfdf","fsfd","trtrt",null)
    println(qwerty.size)
    for (i in qwerty){
        print("$i ")
    }


    println()

    val nullableString: String? = null
    val stringLength: Int = nullableString?.length ?: 0 // TODO ���� �������� null ������� 0,
    // ����� ������ ���� ����� ������� ������ ��������
    println(stringLength)


    // TODO �������� �����������  ��� �� null, ������� ��� !!
    val notNullableString: String = "fdfd"
    val stringLengthNot: Int = notNullableString!!.length
    println(stringLengthNot)



//    println()
//
//    val qwertyRead: String? = readLine()
//    println(qwertyRead)



}
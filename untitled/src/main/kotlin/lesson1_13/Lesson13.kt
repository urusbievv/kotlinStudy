fun main() {


    val qwerty: Array<String?> = arrayOf("fdfdf","fsfd","trtrt",null)
    println(qwerty.size)
    for (i in qwerty){
        print("$i ")
    }


    println()

    val nullableString: String? = null
    val stringLength: Int = nullableString?.length ?: 0 // TODO если значение null выведет 0,
    // также вместо нуля можно указать другое значение
    println(stringLength)


    // TODO оператор утверждение  это не null, пишется так !!
    val notNullableString: String = "fdfd"
    val stringLengthNot: Int = notNullableString!!.length
    println(stringLengthNot)



//    println()
//
//    val qwertyRead: String? = readLine()
//    println(qwertyRead)



}
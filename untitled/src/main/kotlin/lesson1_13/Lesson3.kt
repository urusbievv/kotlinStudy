fun main(){


    val greeting = "Привет"
    val space = ' '
    val userName = "Лорд"

//     println("$greeting, $userName Какая будет завтра погода") // через + тоже можно как в java
//    println("Решение: ${5 + 5}")

    // TODO многострочная запись
    val multiString = """
        dfsdfs
            gsgdfgdf
                gfdgdf
         gdfgdf       
    """.trimIndent()
//    println(multiString)

    // TODO по одной
    val multiString2 = """
        |dfsdfs
            |gsgdfgdf
                |gfdgdf
         |gdfgdf       
    """.trimIndent()
    println(multiString2)

}
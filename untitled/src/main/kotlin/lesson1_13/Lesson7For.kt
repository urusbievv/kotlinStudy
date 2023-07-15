fun main() {

    // циклы


    val range1 = 45..70
    val range2 = 32 until 70 // ключает и 70
    val rangeBack = 67 downTo 13 //  обратном пор€дке
    val range3: CharRange = 'a'..'z'
    val range4: ClosedRange<Double> = 23.1..50.21
    // TODO в for можно перебирать Int и Char числа
    // TODO в Char будет работать потому-что под капотом кодируютс€ в целые числа
    val range5 = 43..65 step 3 // TODO step - по сколько шагает


    // провер€ет есть ли число в данном диапозоне
    val a = 54 in range1
    val b = 54 !in range1
//    println(a)
//    println(b)


//    print("«адайте врем€ таймеру: ")
//    val timeInput = readLine()!!.toInt()
//
//    for (i in timeInput downTo 1 ){
//        println("¬рем€ закончитс€ через: $i")
//        Thread.sleep(1000)
//        if(i == 1){
//            println("¬рем€ вышло!!!")
//        }
//    }

//    val range= 45..70
//    for(i in range step 5)
//        println(i)


    for (i in 5 downTo  1 ){
        if(i == 3){
//            println("ѕользоветель нажал \"ѕропустить\" ")
//            break
            println("i == 3 не будет распечатана")
            continue // преравает цикл в определенном месте,
                    // после чего продолжает работать цикл
//            return // завершает выполнение функции в которой она находитс€
        }
        println("–еклама закончитс€ через: $i")
        Thread.sleep(1000)
        if(i == 1){
            println("¬рем€ вышло!!!")
        }
    }

    println()

    val nums1 = 34
    val nums2 = 43

    for(i in nums1..nums2){
        print("$i ")
    }


}
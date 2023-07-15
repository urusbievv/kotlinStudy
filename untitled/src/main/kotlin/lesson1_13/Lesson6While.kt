fun main() {

    // while, do-while

    var count = 1

//    while (count > 0) {
//        println("Реклама закончится через ${count--}")
//        Thread.sleep(1000)
//    }

    do {
        println("Реклама начнется через ${count++}")
        Thread.sleep(1000)
    } while (count <= 5)

    //      В do-while сначала работает цикл потом уже проверяется
}
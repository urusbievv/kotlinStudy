package exampleMutli

import kotlin.concurrent.thread


// Модифицируйте программу упр. 1 так, чтобы вывод родительской нити производился после завершения дочерней. Используйте join.
fun main() {
    val parentThread = thread {
        for (i in 1..10) {
            println("thread 1: Line $i")
            Thread.sleep(1000)
        }
    }


    parentThread.join()

    val childThread = thread {
        for (i in 1..10) {
            println("thread 2: Line $i")
            Thread.sleep(1000)
        }
    }

    childThread.join()
    println("Finished.")
}
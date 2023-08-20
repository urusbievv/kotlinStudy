package exampleMutli

import kotlin.concurrent.thread


// Напишите программу, которая создает нить. Используйте атрибуты по умолчанию.
// Родительская и вновь созданная нити должны распечатать десять строк текста.

fun main() {
    val parentThread = thread {
        for (i in 1..10) {
            println("thread 1: Line $i")
            Thread.sleep(1000)
        }
    }

	val childThread = thread {
        for (i in 1..10) {
            println("thread 2: Line $i")
            Thread.sleep(1000)
        }
    }

    parentThread.join()
    childThread.join()
    println("Finished.")
}
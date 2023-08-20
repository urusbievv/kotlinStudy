@file:JvmName("Ex3Kt")

package exampleMutli

import kotlin.concurrent.thread


fun printText(textThread: List<String>){

    for (text in textThread) {
        println("${Thread.currentThread().name}: $text ")
        Thread.sleep(2000)
    }
}

fun main() {


    val textThread1 = listOf("secret","bob","strong","example")
    val textThread2 = listOf("baby","job","qwerty")
    val textThread3= listOf("bmw","eat","house","funny")
    val textThread4 = listOf("fix","chit")


    val thread1 = thread {
        printText(textThread1)
    }
    val thread2 = thread {
        printText(textThread2)
    }
    val thread3 = thread {
        printText(textThread3)
    }
    val thread4 = thread {
        printText(textThread4)
    }

    thread1.join()
    thread2.join()
    thread3.join()
    thread4.join()

    println("Finished")
}
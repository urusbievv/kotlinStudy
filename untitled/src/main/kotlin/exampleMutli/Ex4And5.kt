package exampleMutli

import kotlin.concurrent.thread


fun main() {

    // interrupt - прервать

    val currentThread = thread {
        try {
            for (i in 1..10){
                println("Hello from thread: $i")
                Thread.sleep(1000)
            }
        }catch (e: InterruptedException){
            println("Thread was interrupt")
        }

    }

    Thread.sleep(2000)
    currentThread.interrupt()

    currentThread.join()
    println("Finished")
}
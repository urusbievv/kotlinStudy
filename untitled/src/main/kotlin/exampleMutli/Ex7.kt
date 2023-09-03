package exampleMutli

import kotlin.concurrent.thread


//fun main(){
//
//	val textList1 = listOf("break","smart","frog")
//    val textList2 = listOf("grand","small","red")
//
//	val mutex = Mutex()
//
//
//    val parentThreadOther = thread{
//        mutex.lock()
//        try {
//            for (text in textList1) {
//                println("Parent Thread: $text")
//                Thread.sleep(1000)
//            }
//        } finally {
//            mutex.unlock()
//        }
//    }
//
//    val childThreadOther  = thread {
//        mutex.lock()
//        try {
//            for (text in textList2) {
//                println("Child Thread: $text")
//                Thread.sleep(1000)
//            }
//        } finally {
//            mutex.unlock()
//        }
//    }
//
//    parentThreadOther.join()
//    childThreadOther.join()
//
//    println("Both threads have finished.")
//
//}

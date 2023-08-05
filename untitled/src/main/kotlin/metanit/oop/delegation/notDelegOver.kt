package metanit.oop.delegation

import javax.annotation.processing.Messager


// Переопределение функций


interface Messengers{
    // свойство к которой можно обратиться
    val programName: String
    fun sendTextMessage()
    fun sendVideoMessage()
}

class InstantMessengers(override val programName: String): Messengers{

    override fun sendTextMessage() = println("Send text message")
    override fun sendVideoMessage() = println("Send video message")
}


// Класс может переопределять часть функций интерфейса, в этом случае выполнение этих функций не делегируется.
class SmartPhones(val name: String, m: Messengers) : Messengers by  m{
    override fun sendTextMessage() {
        println("Send sms")
    }
}

fun main() {
    val whatsapp = InstantMessengers("Whatsapp")
    val pixel = SmartPhones("Iphone",whatsapp)
    pixel.sendTextMessage()
    pixel.sendVideoMessage()

   // По аналогии с функциями объект может делегировать обращение к свойствам:
    println(pixel.programName)
}
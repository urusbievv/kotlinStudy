package metanit.oop.delegation

import javax.annotation.processing.Messager

// Делегирование представляет паттерн объектно-ориентированного программирования, который позволяет одному объекту
// делегировать/перенаправить все запросы другому объекту. В определенной степени делегирование может выступать
// альтернативой наследованию. И преимуществом Kotlin в данном случае состоит в том, что Kotlin нативно поддерживает
// данный паттерн, предоставляя необходимый инструментарий.
interface Base{
    fun someFun()
}
class BaseImp(): Base{
    override fun someFun() {
        TODO("Not yet implemented")
    }
}
class Derived(someBase: Base): Base by someBase

interface Messenger{
    fun send(message: String)
}
class InstantMessenger(val programName: String): Messenger{
    override fun send(message: String) {
        println("Message `$message` has been send")
    }
}
// Интерфейс Messenger применяет, но не реализует его.
// Вместо этого он принимает через первичный конструктор объект Messenger и делегирует ему обращение к функции send().
class SmartPhone(val name: String, m: Messenger, p: PhotoDevice): Messenger by  m, PhotoDevice by p



// Подобным образом один объект может делегировать выполнение различных функций разным объектам. Например:
interface PhotoDevice{
    fun takePhoto()
}

class PhotoCamera: PhotoDevice{
    override fun takePhoto() {
        println("Take photo")
    }
}

fun main() {
    val telegram = InstantMessenger("Telegram")
    val photoCamera = PhotoCamera()
    val pixel = SmartPhone("Pixel 7",telegram, photoCamera)
    pixel.send("Hello world")
    pixel.takePhoto()
    pixel.send("Learn Kotlin on Metanit.com")
}


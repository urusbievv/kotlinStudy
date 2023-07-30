package metanit.oop.access


private val privateVal = 3
val publicVal = 5


private class PrivateClass(val name: String) // можем использовать внутри данного файла
class PublicClass(val name: String)


// внутри данного файла мы можем использовать приватный метод
private fun privateFun() {
    println("privateFn")
    println(privateVal)
    val privateClass = PrivateClass("Tom")
}

fun publicFun() {
    println("publicFn")
    println(privateVal)
    val privateClass = PrivateClass("Tom")
}

fun main() {
    privateFun()
}
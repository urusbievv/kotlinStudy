package metanit.functions


fun main() {

    val message: () -> Unit
    message = ::hello
    message()
}

fun hello(){
    println("Hello Kotlin")
}


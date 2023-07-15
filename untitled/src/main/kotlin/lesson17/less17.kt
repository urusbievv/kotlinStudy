package lesson17

fun main() {

    val babelFish = BabelFish(null)
    println("old value: ${babelFish.nerveSignal}") // get
//    println("old value: ${babelFish.isTranslated}")
//    babelFish.nerveSignal = 340 // set
//    println("new value: ${babelFish.nerveSignal}") // get
//    println("new value: ${babelFish.isTranslated}")

    val babelFish2 = BabelFish(10)
    println("old value: ${babelFish2.nerveSignal}")

    val babelFish3 = BabelFish(20)
    println("old value: ${babelFish3.nerveSignal}")
}
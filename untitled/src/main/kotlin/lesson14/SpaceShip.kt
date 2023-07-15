package lesson14

open class SpaceShip( // open - класс родитель
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false, // могут быть и не беспилотники

    ) {

    fun switchToWarpMode() {
        println("ѕереход в варп-режим")
    }

    // open тут нужен чтобы можно было переопредел€ть метод
    open fun runSystemDiagnostic() {
        println("«апущена диагностика")
    }



}
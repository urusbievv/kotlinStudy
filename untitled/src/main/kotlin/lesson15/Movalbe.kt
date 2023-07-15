package lesson15

interface Movable {

    fun startEngine(){
        println("Двигатель запущен")
    }

    fun prepareForTakeOff() // подготовка к запуску
    fun prepareForLanding() // посадка
}
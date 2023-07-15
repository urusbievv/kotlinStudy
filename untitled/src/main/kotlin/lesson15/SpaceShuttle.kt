package lesson15
// это нужно чтобы недублировать код
// нельзя реализовать несколько абстактных классов
// а несколько интерфесов реализовать можно

abstract class SpaceShuttle : Movable, Shootable {
    abstract val tankSize: Int // размер бака
    abstract fun runDiagnostic()
}


// класс потомок
// абсстрактный класс необходимо переопределть
class Upsilon(
    override val tankSize: Int
    ) : SpaceShuttle() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeOff() {
        println("Развернуть крылья")
    }

    override fun prepareForLanding() {
        println("Повернуть крылья")
    }

    override fun startShooting() {
       println("Начать стрельбу")
    }

    override fun reloadGuns() {
        println("Перезарядить")
    }
}
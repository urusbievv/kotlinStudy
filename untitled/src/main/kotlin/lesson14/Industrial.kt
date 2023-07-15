package lesson14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int
) : SpaceShip(name,speed,unmanned = true) {


    fun launchDrones(){
        println("$name: сканирующие дроны запущены")
    }

    override fun runSystemDiagnostic() {
        // super - если нужно чтобы сперва запустился метод родительского класса
        super.runSystemDiagnostic()
        println("$name: запущена диагностика дронов и майнеров")
    }
}
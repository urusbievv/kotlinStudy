package lesson14

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
) : SpaceShip(name,speed) {


    fun runAfterburner(){
        println("$name: ������ �������")
    }

    fun handleDataFromRadar(){
        println("$name: ��������� ������ � ������")
    }
}
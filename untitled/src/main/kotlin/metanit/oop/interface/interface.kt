package metanit.oop.`interface`





interface Info{

    val model: String
        get() = "Undefined"
	val number: String

}


interface Movable{

    val speed: Int
    fun move()

    fun stop(){
        println("Остановка")
    }
}


class Car(override val number: String, override val model: String): Movable, Info{
    override val speed = 60

    override fun move() {
        println("Машина едет со скоростью $speed км/ч")
    }
}


class Aircraft: Movable{
    override val speed = 600

    override fun move(){
        println("Самолет летит со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Приземление")
    }
}


open class Video{
    open fun play() = println("Play video")
}

interface AudioPlayer{
    fun play() = println("Play audio")
}

class MediaPlayer: Video(), AudioPlayer{
    override fun play() {
        super<Video>.play()
        super<AudioPlayer>.play()
    }

}


fun main() {


    val m1 = Car("Tesla","234521")
    val m2 = Aircraft()
	val mediaPlayer =  MediaPlayer()

	println(m1.number)
    println(m1.model)

    m1.move()
    m1.stop()
    m2.move()
    m2.stop()

    mediaPlayer.play()
}

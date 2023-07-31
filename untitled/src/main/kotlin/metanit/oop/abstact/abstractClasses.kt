package metanit.oop.abstact



abstract class Human(val name: String){

    abstract var age: Int
    abstract fun hello()
}

class Person(name: String) : Human(name){
    override var age: Int = 1
    override fun hello() {
        println("My name is $name")
    }
}

fun main() {

    val kate: Person = Person("Kate")
    val slim: Human = Person("Slim Shady")
    kate.hello()
    slim.hello()


}

abstract class Figure {
    abstract fun perimeter(): Float
    abstract fun area(): Float
}
class Rectangle(val width: Float, val height: Float) : Figure()
{
    override fun perimeter(): Float = width * 2 + height * 2;

    override fun area(): Float = width * height;
}
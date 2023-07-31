package metanit.oop.nestedInner


class Person {
    class Account(val username: String, val password: String) {

        fun showDetails() = println("UserName: $username  Password: $password")

    }


}

fun main() {

    // Но для обращения к вложенному классу надо использовать имя внешнего класса.
    val userAcc = Person.Account("qwerty","123456")
	userAcc.showDetails()



    val tom = User("qwerty", "123456");
    tom.show()

    val someClass = OverClass()
    someClass.move()
    someClass.origin()
}


class User(username: String,password: String){

	// Если необходимо ограничить область применения вложенного класса только внешним классом,
    // то следует определить вложенный класс с модификатором private:
    private class Account(val username: String, val password: String)

    private val account: Account = Account(username, password)

    fun show() = println("UserName: ${account.username}  Password: $account.password")

}



// Классы также могут содержать вложенные интерфейсы. Кроме того, интерфейсы тоже могут содержать вложенные классы и интерфейсы:
interface SomeInterface{
    open class NestedClass{
        fun origin() = println("Эу")
    }
    interface NestedInterface
}


class OverClass: SomeClass.NestedInterface, SomeInterface.NestedClass() {

    override val number: Int
        get() = 25
}

class SomeClass{



    class NestedClass
    interface NestedInterface{

        val number: Int
        fun move() = println("hello girl $number")
    }
}

// вложенный (nested) класс по умолчанию не имеет доступа к свойствам и функциям внешнего класса.
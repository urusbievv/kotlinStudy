package metanit.oop.nestedInner



// вложенный (nested) класс по умолчанию не имеет доступа к свойствам и функциям внешнего класса.
class BankAccount(private var sum: Int){

    fun display(){
        println("sum = $sum")
    }

 /*   class Transaction{
        fun pay(s: Int){
            // вложенный класс не может обращаться к функциям и методам
            // sum -= s // будет ошибка
            // display() // будет ошибка
        }
    }

  */

    // чтобы получить доступ к функциям и свойствам внешнего класса мы должны сделать его внутренним (inner)
    inner class Transaction(private val sum: Int){
        fun pay(){
            this@BankAccount.sum = -this.sum // (-this.sum), тоже что и (-this@Transaction.sum)
            display()
        }
    }
}


fun main() {
    // Но теперь если мы хотим использовать объект подобного вложенного класса, то необходимо создать объект внешнего класса
    val acc = BankAccount(3500);
    	acc.Transaction(2500).pay()

	// Запись такая, чтобы вызвать inner класс
    val a = A();
    	a.B().action()
}

// Но что если свойства и функции внутреннего класса называются также, как и свойства и функции внешнего класса.
// Обращаемся через this
class A{
    private val n: Int = 1
    inner class B{
        private val n: Int = 3

        fun action(){
            println(n) // n из класса B
            println(this.n) // n из класса B
            println(this@A.n)  // n из класса A
            println(this@B.n) // n из класса B
        }
    }
}


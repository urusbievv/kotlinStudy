package metanit.oop.getAndSet


var balance: Int = 110
    set(value) {
        println("Call setter")
        if ((value > 0) and (value < 110)) {
            field = value
        }
    }
    get() {
        println("Call getter")
        return field
    }


fun main() {
    balance // сработает get
    balance = 2000 // сработает set
    println(balance) // сработает get
}


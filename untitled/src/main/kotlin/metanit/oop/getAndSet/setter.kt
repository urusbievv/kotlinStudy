package metanit.oop.getAndSet


// допустим нам нужно чтобы пользователь приминив свойство age не указал отрицательное значение
var age: Int = 18
    set(value) { // для проверки входных данных исп setter
        if ((value > 0) and (value < 110)) { // указываем диапозон входных параметров
            field = value

        }
    }
// field непосредственно хранит значение свойства.
/*
        напрямую в классе мы не можем определять поля, мы можем работать только со свойствами
TODO    в нашем случае если мы присвоим значение напрямую к age, а не к field то будет рекурсия
*/

fun main() {

    println(age) // тут будет значение по умочанию которое мы указали ранее
    age = 55
    println(age) // изменили значение
    age = -434
    println(age) // выведет предыдущее значение так как в set не входит в наш диапазон
    age = 535
    println(age) // тоже не входит
}
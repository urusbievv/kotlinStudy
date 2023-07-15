package lesson19

fun main() {

    // enum - вызываемые константы, упрощают код ораничевая кол-во возможных состояний

    // ТODO - нужен как заглушка в коде, если мы создали  функцию но пока ничего не добавили
    // туда пишем ТODO
    // также можем указать развернутое объяснение
    // ТODO ("записать метод getTree()")
    // TODO - можно использовать в качестве заметок

    val statusServer = listOf<Int>(101,102,103)

    for (i in statusServer){
        when (i){
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(1000)
    }

    println()
//    println(Status.NEW.name) // получаем имя константы
//    println(Status.NEW.ordinal) // получаем порядковый номер константы
//    for (i in Status.values()) println(i) // получаем массив(список) enum

    println(Status.NEW.getStatusDes())
    println(Status.COOKING.getStatusDes())
    println(Status.COMPLETED.getStatusDes())


}

enum class Status(val id: Int){
    NEW(101) {
        override fun getStatusDes(): String {
            return "Заказ создан и ожидает оплаты"
        }
    },
    COOKING(102) {
        override fun getStatusDes(): String {
            return "Заказ оплачен и начал готовиться"
        }
    },
    COMPLETED(103) {
        override fun getStatusDes(): String {
            return "Заказ готов, можете забрать"
        }
    },
    ERROR(0) {
        override fun getStatusDes(): String {
            return "Что-то пошло не так, мы уже разбираемся"
        }
    };

    // также в классах перечисление (enum) можно создавать функции
    abstract fun getStatusDes() : String
}

fun setStatus(status: Status){
    val printStatus = when(status){
        Status.NEW -> "Заказ принят"
        Status.COOKING -> "Заказ готовиться"
        Status.COMPLETED -> "Заказ готов"
        Status.ERROR -> "Статус неизвестен"
    }
    println(printStatus)
}
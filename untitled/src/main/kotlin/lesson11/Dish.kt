package lesson11

class Dish( // при создании класса вызывается конструктор класса
    val id: Int, // указываем тип явно чтобы, предостратило вероятность повторение в базе
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false, // добавлено ли какое то блюдо в избранное или нет,
                                        // = false, значение по умолчанию, не обязательно указывать
                                        // данные объекты inFavorites, не будут в избранном (false)
) {

    fun addToFavorites(){
        println("Блюдо $name добавлено")
        inFavorites = true
    }

    fun removeFromFavorites(){
        println("Блюдо $name удалено избранного")
        inFavorites = false
    }

    fun startCooking(){
        println("Пользователь перешел на экран начала приготовление блюда $name")
    }

    fun downloadIngredients(): List<String>{ // TODO возвращает для выбранного блюда
        return ingredients
    }
}
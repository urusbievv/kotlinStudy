package lesson11


fun main() {

    val dish1 = Dish(
        // создаем экземпл€р класса
        id = 1,
        name = "яичница",
        category = "«автрак",
        ingredients = listOf("€йцо", "помидор", "соль", "перец"),
    )

    val dish2 = Dish(
        id = 2,
        name = "—уп",
        category = "ќбед",
        ingredients = listOf("вода", "курица", "вермишель", "соль", "перец"),
    )


//    println(dish.name)
//    println(dish.category)
//    println(dish.ingredients)
//    println(dish.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.category)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

    // свойства можно измен€ть, дл€ этого нужно значение должно быть var
//    dish1.category = "Ѕлюда из €иц"
//    dish1.inFavorites = true
//    println(dish1.category)
//    println(dish1.inFavorites)


    println("ƒействи€ дл€ блюда яичница")
    dish1.addToFavorites()
    println(dish1.ingredients)
    dish1.startCooking()

    println()

    println("ƒействи€ дл€ блюда —уп")
    dish2.addToFavorites()
    println(dish2.ingredients)
    // пользователь решил скачать список с ингредиентами
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.ingredients)


    val ingredient1 = Ingredients("лук репчатый",500,1);
    val ingredient2 = Ingredients("картошка",200,1,true)
    println(ingredient1.name)
    println(ingredient2.name)




}
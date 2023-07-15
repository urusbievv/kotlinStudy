package lesson11


fun main() {

    val dish1 = Dish(
        // ������� ��������� ������
        id = 1,
        name = "�������",
        category = "�������",
        ingredients = listOf("����", "�������", "����", "�����"),
    )

    val dish2 = Dish(
        id = 2,
        name = "���",
        category = "����",
        ingredients = listOf("����", "������", "���������", "����", "�����"),
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

    // �������� ����� ��������, ��� ����� ����� �������� ������ ���� var
//    dish1.category = "����� �� ���"
//    dish1.inFavorites = true
//    println(dish1.category)
//    println(dish1.inFavorites)


    println("�������� ��� ����� �������")
    dish1.addToFavorites()
    println(dish1.ingredients)
    dish1.startCooking()

    println()

    println("�������� ��� ����� ���")
    dish2.addToFavorites()
    println(dish2.ingredients)
    // ������������ ����� ������� ������ � �������������
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.ingredients)


    val ingredient1 = Ingredients("��� ��������",500,1);
    val ingredient2 = Ingredients("��������",200,1,true)
    println(ingredient1.name)
    println(ingredient2.name)




}
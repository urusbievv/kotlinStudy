package lesson22


fun main() {
    // class vs data class

    // equals(), hashCode(), toString(), copy()
    // copy() - доступен только в data class

    // == - сравниваются ссылки на объекты в памяти, а не значение (false)

    val word1 = Word("red","красный")
    val word2 = Word("red","красный")
    val word3 = Word("Animals","Животные")


    // если data class, то мы сравниваем значение (true),
    // если просто class, то ссылки на объекты в памяти (false)
    println(word1 == word2)

    println(word1 === word2) // тоже сравнивает ссылки на объекты в памяти,
    // но он никак не относиться equals, ведет себя одинаково не в зависимости от типа класса


//    val word4 = word3.copy(text = "New Animals") // копирует данные, также можно переопределить поле
//    println(word4)


    // hashCode -возвращает уникальный код объекта,
    // также используется как equals(), но он сравнивает быстрее,
    // так как два числа сравнивать быстрее, чем все свойства и значение объекта
    println(word1.hashCode())
    println(word2.hashCode())
}

//class Word(
//    val text: String,
//    val translate: String,
//){
//    override fun toString(): String { // переопределяем toString
//        return "$text his translate $translate"
//    }
//}

// можно автоматически переопределить, так добавив data перед классом
data class Word(
    val text: String,
    val translate: String,
){

}

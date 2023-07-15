package lesson16

// распространяется на весь текущий файл
private val supportInfo = "Support Info"

class HitchHiker {

    private var numberOfPages: Int? = null

    var title = ""

    private fun chooseArticle() {
        println("Open catalog")
    }

    fun getNumberOfPages() = numberOfPages // " = " вместо return



    fun setNumberOfPages(numberOfPages: Int){
        this.numberOfPages = numberOfPages
    }

}

// получаем данные HichHucker и распечатываем
class Support {

    fun printInfo() {
//        println(HitchHiker::class.simpleName)
    }
}
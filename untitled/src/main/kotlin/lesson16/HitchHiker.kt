package lesson16

// ���������������� �� ���� ������� ����
private val supportInfo = "Support Info"

class HitchHiker {

    private var numberOfPages: Int? = null

    var title = ""

    private fun chooseArticle() {
        println("Open catalog")
    }

    fun getNumberOfPages() = numberOfPages // " = " ������ return



    fun setNumberOfPages(numberOfPages: Int){
        this.numberOfPages = numberOfPages
    }

}

// �������� ������ HichHucker � �������������
class Support {

    fun printInfo() {
//        println(HitchHiker::class.simpleName)
    }
}
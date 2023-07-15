package lesson16


fun main() {

    // public - видны всем (ставиться по умолчанию)
    // private - в рамках файла, класса если данные внутри него
    // protected - видны в классе в котором определены и в клаасах наследников
    // internal - доступны в любой части модуля в котором они определены (в Android)


//    val guide = HitchHiker()
//    guide.title = "Don't panic"
//    guide.chooseArticle()

//    val support = Support()
//    support.printInfo()


    val hiker = HitchHiker()
    println(hiker.getNumberOfPages())
    hiker.setNumberOfPages(323)
    println(hiker.getNumberOfPages())


}

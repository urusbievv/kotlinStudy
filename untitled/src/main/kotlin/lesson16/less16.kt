package lesson16


fun main() {

    // public - ����� ���� (��������� �� ���������)
    // private - � ������ �����, ������ ���� ������ ������ ����
    // protected - ����� � ������ � ������� ���������� � � ������� �����������
    // internal - �������� � ����� ����� ������ � ������� ��� ���������� (� Android)


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

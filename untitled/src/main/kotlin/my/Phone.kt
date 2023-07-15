package my

class Phone(
    private val id: Int,
    private val name: String,
    private val model: List<String>,
    private var inFavorites: Boolean = false,
){

    fun addPhoneFavorites(){
        println("������� $name ��������")
        inFavorites = true
    }

    fun removePhoneFavorites(){
        println("������� $name ��� ������")
        inFavorites = false
    }

    fun downloadModel(): List<String>{
        return model
    }
}
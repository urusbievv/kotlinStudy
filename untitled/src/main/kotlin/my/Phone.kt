package my

class Phone(
    private val id: Int,
    private val name: String,
    private val model: List<String>,
    private var inFavorites: Boolean = false,
){

    fun addPhoneFavorites(){
        println("Телефон $name добавлен")
        inFavorites = true
    }

    fun removePhoneFavorites(){
        println("Телефон $name был удален")
        inFavorites = false
    }

    fun downloadModel(): List<String>{
        return model
    }
}
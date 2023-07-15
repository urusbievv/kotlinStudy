package lesson18

import java.util.*

open class NotesItemMof { // полиморф с наследниками

    // функция без принимающих параметров
    open fun getItemData() = ""

}

class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : NotesItemMof() {
    override fun getItemData(): String {
        return "Item \"$title\" added cell - $creationDate\nType: $type\nData: $data"
    }
}
class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NotesItemMof(){
    override fun getItemData(): String {
        return "Item \"$title\" added cell - $creationDate\nType: $type\nData: $data"
    }
}
class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NotesItemMof(){
    override fun getItemData(): String {
        return "Item \"$title\" added cell - $creationDate\nType: $type\nData: $data"
    }
}
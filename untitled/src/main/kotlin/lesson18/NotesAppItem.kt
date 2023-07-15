package lesson18

import java.util.Date


class NotesAppItem {


    fun addItemCell(
        title: String,
        creationDate: Date,
        type: String,
        data: String,
    ){
        println("Item \"$title\" added cell - $creationDate\nType: $type\nData: $data")
    }

    fun addItemCell(
        title: String,
        creationDate: Date,
        type: String,
        data: Long,
    ){
        println("Item \"$title\" added cell - $creationDate\nType: $type\nData: $data")
    }

    fun addItemCell(
        title: String,
        creationDate: Date,
        type: String,
        data: List<String>,
    ){
        println("Item \"$title\" added cell - $creationDate\nType: $type\nData: $data")
    }


}
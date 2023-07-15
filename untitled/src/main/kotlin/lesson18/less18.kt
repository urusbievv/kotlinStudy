package lesson18

import java.util.*


fun main() {

//  ad hoc - (по случаю когда одна функция определяется для разлизных типов данных)
//     При вызове этой функции компилятор определяет,
//     какая функция сработает по кол-ву и типам передаваемых параметров
//     Минус такого подхода, нужно наделать множество реализаций этой функции


//  subtyping - (полиморфизм получения)
//      Реализация через Принцип Барбары лисков.
//      Функция которая исп базовый тип должны иметь возможность исп подтип базового типа,
//      не зная об этом.
//      Тоесть объект узкого типа всегда может исп так где может и объект более широкого типа

//  parametric - (параметрический)

    val creationDate = Date()

//    val notes = NotesAppItem()
//    notes.addItemCell(
//        "call sister",
//        creationDate,
//        "message",
//        "call sister to congratulate",
//    )
//    println()
//    notes.addItemCell(
//        "sister's number",
//        creationDate,
//        "phone",
//        8_988_543_33_44,
//    )
//    println()
//    notes.addItemCell(
//        "todolist",
//        creationDate,
//        "list",
//        listOf("wash dog","cleaning home","buy products"),
//    )


                // полиморф с наследником

    val messageItem: NotesItemMof = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )

    val phoneItem: NotesItemMof = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        8_988_543_33_44,
    )

    val listItem: NotesItemMof = ListItem(
        "todolist",
        creationDate,
        "list",
        listOf("wash dog","cleaning home","buy products"),
    )

    val arrayListItem = arrayOf<NotesItemMof>(messageItem,phoneItem,listItem)
    showItem(arrayListItem)
}

fun showItem(notes: Array<NotesItemMof>){
    notes.forEach {
        println(it.getItemData())
    }
}


package lesson18

import java.util.*


fun main() {

//  ad hoc - (�� ������ ����� ���� ������� ������������ ��� ��������� ����� ������)
//     ��� ������ ���� ������� ���������� ����������,
//     ����� ������� ��������� �� ���-�� � ����� ������������ ����������
//     ����� ������ �������, ����� �������� ��������� ���������� ���� �������


//  subtyping - (����������� ���������)
//      ���������� ����� ������� ������� ������.
//      ������� ������� ��� ������� ��� ������ ����� ����������� ��� ������ �������� ����,
//      �� ���� �� ����.
//      ������ ������ ������ ���� ������ ����� ��� ��� ��� ����� � ������ ����� �������� ����

//  parametric - (���������������)

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


                // �������� � �����������

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


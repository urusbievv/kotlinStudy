package lesson21

import java.io.File

//возвращает имя файла без расширения, то есть "textFile".
val File.nameWithoutExtension: String
    get() = name.substringBeforeLast(".")

fun main() {

    /*
    Extensions (расширения) в Kotlin позволяют добавлять новые функциональности к существующим классам без
    изменения их исходного кода. Это мощная возможность языка Kotlin, которая позволяет расширять функциональность
    классов и типов данных, включая стандартные классы и классы, определенные в пользовательском коде.
    */

    val files = File("textFile.txt")
    files.writeToFileAndSend()
    files.writeText("say my name")

    println(files.nameWithoutExtension)

}

// расширяем функционал
fun File.writeToFileAndSend(){

    val a = 5 + 5
    val message = "some $a"
    createNewFile() // создание нового файла
    writeText(message)  // writeText - для записи текста в файл

    println("message: \"$message\" added to file $name and send")



}
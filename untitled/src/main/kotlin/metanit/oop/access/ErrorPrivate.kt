package metanit.oop.access


private class Message(val text: String)


// message: Message - будет ошибка так как публичная функция не может принимать приватный метод
/*TODO
    fun send(message: Message <- "тут будет ошибка", address : String){
        println("Message `${message.text}` has been sent to $address")
    }

*/
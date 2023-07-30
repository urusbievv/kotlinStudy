package metanit.sms


class Message(val text: String)

fun send(message: Message, phoneNumber: String) {
    println("Message `${message.text}` has been sent to $phoneNumber")
}
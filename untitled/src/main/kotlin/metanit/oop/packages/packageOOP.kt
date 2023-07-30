package metanit.oop.packages


import metanit.email.Message as EmailMessage
import metanit.email.send as sendEmail
import metanit.sms.Message as SmsMessage
import metanit.sms.send as sendSms

fun main() {

    val emailMessage = EmailMessage("Hello Kotlin")
    sendEmail(emailMessage, "albert@mail.com")

    val smsMessage = SmsMessage("My Phone")
    sendSms(smsMessage, "+7 8987 554 44 22")

}

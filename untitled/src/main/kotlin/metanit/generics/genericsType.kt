package metanit.generics



class Human2<T>(id: T,name: String)

fun main() {


    val human: Human2<Int> = Human2(1,"Ani")
    val human2: Human2<String> = Human2("A","Huster")
}



//Обобщенные функции
//Функции, как и классы, могут быть обобщенными.
/*
	fun main() {

    display("Hello Kotlin")
    display(1234)
    display(true)
	}
	fun <T> display(obj: T){
    	println(obj)
	}
*/
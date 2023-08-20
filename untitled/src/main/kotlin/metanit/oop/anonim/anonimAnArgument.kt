package metanit.oop.anonim

// Анонимный объект может передаваться в качестве аргумента в вызов функции:
/*
	fun main() {
    	hello(
      	  object : Person3("Sam"){
          	  val company = "JetBrains"
           	  override fun sayHello(){
            	    println("Hi, my name is $name. I work in $company")
            	}
        	})
	}
	fun hello(person: Person3){
    	person.sayHello()
	}
	open class Person3(val name: String){
    	open fun sayHello() = println("Hi, my name is $name")
		}

 */

// Функция может возвращать анонимный объект:
fun main() {
    val tom = createPerson("Tom", "JetBrains")
    tom.sayHello()
}
private fun createPerson(_name: String, _company: String) = object{
    val name = _name
    val company = _company
    fun sayHello() = println("Hi, my name is $name. I work in $company")
}




// Однако тут есть нюансы. Чтобы мы могли обращаться к свойствам и функциям анонимного объекта,
// функция, которая возвращает этот объект, должна быть приватной, как в примере выше.
//
//Если функция имеет модификатор public или private inline, то в этом случае свойства и функции
// анонимного класса (за исключением унаследованных) недоступны:

/*
	fun main() {
    	val tom = createPerson("Tom", "JetBrains")
    	println(tom.name)   // норм - свойство name унаследовано от Person
    	println(tom.company)    // ! Ошибка - свойство недоступно
	}
	private inline fun createPerson(_name: String, _comp: String) = object: Person(_name){
    	val company = _comp
		}

	open class Person(val name: String)

*/
package lesson20

import java.util.Calendar

fun main() {

//    Лямбда-функция - это анонимная функция, которая может быть использована в качестве значения или передана
//    в другую функцию в качестве аргумента.
//    Она является сокращенной и компактной формой определения функции.

    // анонимные функции объявляются как fun, но без названия


    val calendar: Calendar = Calendar.getInstance() // получем календарь

    // возвращаем разниццу кол-во дней в году и текущего дня сначала года
    // анонимный метод можно возвращать из другого метода
    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

//    println(getDaysToEndYear.invoke()) // invoke - вызвать
    // можно написать и так
    println("Days:")
    println(getDaysToEndYear())

    // конвертация дней, который мы написали сверху в миллисекунды
    println("Days convert in Millis:")
    // Unit - функция ничего не возвращает
    // (Int) - входные параметры
    val convertEndDaysToMillis: (Int) -> Unit = fun(endDays: Int) = println("convert anonim fun: ${1000 * 60 * 60 * 24 * endDays}")
    convertEndDaysToMillis(getDaysToEndYear())

    val convertLambda = { endDays: Int -> // endDays как it - принимающий параметр
        println("convert lambda : ${1000 * 60 * 60 * 24 * endDays}")
    }
    convertLambda(getDaysToEndYear())

//TODO Лямбды могут:
//     1) присваивать переменные,
//     2) передавать и возвращать из обычных функций.
//     То есть можно передать в другую функцию какое-то поведение, чтобы это действие выполнилось внутри другого метода
//     return в лямбдах не нужен.
//     Также это могут и анонимные функции.

//     Лямбды - можно считать за анонимные функции у которых нет названия.
//     Разница между анонимными функциями и лямбдами в том что,
//     анонимы без названия объявляются с помощью "fun()",
//     а лямбды с помощью заключения кода в фигурные скобки "() ->"
    println()

    // Создание Лямбды
    //TODO Unit - ничего не возвращает
    //TODO (Int) - принимающий параметр
    val printStringWithLambda: (Int) -> Unit = {
        println("print string with lambda $it") // it - печатаем принимающий параметр, только один параметр
    }
    printStringWithLambda(4343);  // в скобках указываем принимающий параметр (Int)
    // ; - ставим чтобы не смешалось с другой лямбдой

    // лямбда функцию можно записать таким образом тоже, короткая запись
    {it: Int -> println("print string with lambdaShort $it") }(4343)



    //  Прочие записи


    val printStringWithLambda2: (Int) -> String = { answer: Int -> // answer вместо it
        "print string with lambda String $answer"
    }
    println(printStringWithLambda2(321));

    // короткая запись
    println({it: Int -> "print string with lambdaShort String $it"}(321))




}
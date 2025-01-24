fun main() {
    val aa = 8
    val bb = 7.6
    val cc = "Text"
    val dd = true
    print(aa)
    print(bb)
    print(cc)
    print(dd)
    println()

    val personOne = Person<Int>("Ivan", 1234567891)
    val personTwo = Person<String>("Petr", "1234567891a")
    println(personOne)
    println(personTwo)
    println()

    val a: Int = 10
    val b: String = "Hello"
    val c: List<Int> = listOf(10, 16, 3)
    val d = 'f'
    outputToConsoleOfVariablesOfDifferentDataTypes(a, '{')
    outputToConsoleOfVariablesOfDifferentDataTypes(b, '[')
    outputToConsoleOfVariablesOfDifferentDataTypes(c, '"')
    outputToConsoleOfVariablesOfDifferentDataTypes(d, '(')
}

/*
Написать функцию print(), которая на вход может принимать различные типы.
Вызвать эту функцию несколько раз, поместив аргументы разных типов.
*/
fun <T> print(parameter: T) = println(parameter)


/*
Создать класс параметризованный класс Person, у которого свойство номера телефона в конструкторе
может передаваться по – разному, как в виде числа, так и в виде строки.
Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой.
Вывести полученную информацию о них.
Person: name = имя, phone = телефон
*/
class Person<T>(val name: String, val phone: T){

    override fun toString(): String {
        return "Person: name = $name, phone = $phone"
    }
}

/*
Написать функцию вывода в консоль переменных разных типов данных.
Вторым параметром в функции будет тип Char и будет представлять то, во что будет оборачиваться
переменная параметризованного типа, поступающая на вход в качестве первого параметра.
Например, переменная Int должна оборачиваться в фигурные скобки.
Пример ввода данных и полученного результата должен быть таким:
val a: Int = 10 -> {10}
val b: String = "Hello" -> [Hello]
val c: List<Int> = listOf(10, 16, 3) -> "[10, 16, 3]"
val d = 'f' -> (f)
*/
fun <T> outputToConsoleOfVariablesOfDifferentDataTypes(variables: T, char: Char){
    val charTwo: Char = when (char){
        '{', '[' -> char.plus(2)
        '(' -> char.plus(1)
        else -> char
    }
    println("$char$variables$charTwo")
}
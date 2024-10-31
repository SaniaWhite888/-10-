fun fizzBuzz(n: Int): List<Any> {
    val result = mutableListOf<Any>()
    for (i in 1..n) {
        when {
            i % 15 == 0 -> result.add("ВизллБизлл")
            i % 3 == 0 -> result.add("Физллл")
            i % 5 == 0 -> result.add("Бизлллл")
            else -> result.add(i)
        }
    }
    return result
}
fun main() {
    println(printNumber(0))
    println(printNumber(2))
    println(printNumber(5))  
    pyramid(1)
    println()
    pyramid(2)
    println()
    pyramid(3)
    val text = "Hello, world!"
    val shiftedText = caesarCipher(text, 3)
    println("Исходный текст: $text")
    println("Зашифрованный текст: $shiftedText")
    println(fizzBuzz(5))
    println(fizzBuzz(16))
}
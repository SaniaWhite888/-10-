fun printNumber(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    }
    val numbers = mutableListOf<Int>()
    for (i in n downTo 1) {
        numbers.add(i)
    }
    return numbers
}
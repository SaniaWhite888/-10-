fun pyramid(n: Int) {
    for (i in 1..n) {
        val spaces = (n - i)
        val hashes = 2 - 1
        println(" ".repeat(spaces) + "#".repeat(hashes) + " ".repeat(spaces))
    }
}
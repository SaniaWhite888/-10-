fun caesarCipher(text: String, shift: Int): String {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val result = StringBuilder()
    for (char in text) {
        if (char.isLetter()) {
            val index = alphabet.indexOf(char.uppercaseChar())
            val newIndex = (index + shift) % 26
            result.append(alphabet[newIndex])
        } else {
            result.append(char)
        }
    }
    return result.toString()
}
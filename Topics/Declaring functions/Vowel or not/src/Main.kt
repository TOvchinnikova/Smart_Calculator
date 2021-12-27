// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(character: Char): Boolean {
    val vowels = arrayListOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
    return vowels.contains(character)
}
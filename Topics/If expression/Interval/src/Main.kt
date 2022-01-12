fun main() {
    val number = readLine()!!.toInt()
    println(
        if (number > -15 && number <= 12 || number in 15..16 || number >= 19) {
            "True"
        } else {
            "False"
        }
    )
}
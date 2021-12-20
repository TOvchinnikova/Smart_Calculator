fun main() {
    val value = readLine()!!.toInt()
    val digit1 = value / 100
    val a = value % 100
    val digit2 = a / 10
    val digit3 = a % 10
    println(digit1 + digit2 + digit3)
}


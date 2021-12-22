fun main() {
    val qntCup = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()
    if (isWeekend) {
        println(qntCup >= 15 && qntCup <= 25)
    } else {
        println(qntCup >= 10 && qntCup <= 20)
    }
}
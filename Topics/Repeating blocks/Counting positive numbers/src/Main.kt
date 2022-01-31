fun main() {
    val qntSequence = readLine()!!.toInt()
    var qntPositiveNumber = 0
    repeat(qntSequence) {
        val number = readLine()!!.toInt()
        if (number > 0) qntPositiveNumber++
    }
    println(qntPositiveNumber)
}
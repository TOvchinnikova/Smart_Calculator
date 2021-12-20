fun main() {
    val value1 = readLine()!!.toInt()
    val value2 = readLine()!!.toInt()
    val value3 = readLine()!!.toInt()
    println(getQntDesc(value1) + getQntDesc(value2) + getQntDesc(value3))
}

private fun getQntDesc(value: Int): Int {
    return if (value % 2 == 0) value / 2 else value / 2 + 1
}
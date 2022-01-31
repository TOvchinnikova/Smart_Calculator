fun main() {
    val qntElements = readLine()!!.toInt()
    if (qntElements > 1000) {
        throw IllegalArgumentException("Invalid number of elements")
    } else {
        var max = 0
        repeat(qntElements) {
            val number = readLine()!!.toInt()
            if (number > 30000) {
                throw IllegalArgumentException("Invalid element value")
            } else {
                if (number.toFloat() % 4F == 0F && max < number) {
                    max = number
                }
            }
        }
        println(max)
    }

}
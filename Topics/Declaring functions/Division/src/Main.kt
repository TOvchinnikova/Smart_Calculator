// write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}

fun divide(first: Long, second: Long): Double {
    return if (second != 0L) {
        first.toDouble() / second.toDouble()
    } else {
        throw RuntimeException("The second argument cannot be 0")
    }
}
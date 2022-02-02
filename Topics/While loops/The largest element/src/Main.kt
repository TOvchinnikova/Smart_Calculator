fun main() {
    var i = readLine()!!.toInt()
    var result = 0
    while (i > 0) {
        if (result < i) {
            result = i
        }
        i = readLine()!!.toInt()
    }
    println(result)
}
fun main() {
    var i = readLine()!!.toInt()
    var result = 0
    while (i > 0) {
        result += i
        i = readLine()!!.toInt()
    }
    println(result)
}
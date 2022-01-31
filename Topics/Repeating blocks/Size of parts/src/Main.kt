fun main() {
    val qntElements = readLine()!!.toInt()
    var idealNumber = 0
    var largeNumber = 0
    var defectiveNumber = 0
    repeat(qntElements) {
        val detector = readLine()!!.toInt()
        when (detector) {
            -1 -> defectiveNumber++
            0 -> idealNumber++
            1 -> largeNumber++
        }
    }
    print("$idealNumber $largeNumber $defectiveNumber")
}
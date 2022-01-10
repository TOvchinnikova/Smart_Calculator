fun main() {
    val time = readLine()
    val date = readLine()
    val resultDate = date?.replace(" ", "/")
    val resultTime = time?.replace(" ", ":")
    println("$resultTime $resultDate")
}

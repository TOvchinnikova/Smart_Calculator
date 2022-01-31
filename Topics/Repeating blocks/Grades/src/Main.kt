fun main() {
    val qntStudents = readLine()!!.toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(qntStudents) {
        val grade = readLine()!!.toInt()
        if (grade > 5 || grade < 2) {
            throw IllegalArgumentException("Incorrect grade")
        } else {
            when(grade) {
                2 -> d++
                3 -> c++
                4 -> b++
                5 -> a++
            }
        }
    }
    print("$d $c $b $a")
}
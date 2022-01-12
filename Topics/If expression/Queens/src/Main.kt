import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.next().toInt()
    val y1 = scanner.next().toInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.next().toInt()
    println(if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2)) "YES" else "NO")

}
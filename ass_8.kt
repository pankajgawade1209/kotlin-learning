import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var choice: String

    do {
        var num = 10
        while (num >= 1) {
            println(num)
            num--
        }
        print("Do you want to restart countdown? (yes/no): ")
        choice = sc.next().lowercase()   // ✅ use next() instead of nextLine()
    } while (choice == "yes")

    println("Countdown stopped.")
}

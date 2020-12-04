package Assignment1


fun main() {
    val row: Int = 5
    for (i: Int in 1..row) {
        for (j: Int in 1..i)
            print("* ")
        println("")
    }

}
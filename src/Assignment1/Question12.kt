package Assignment1

fun main(){
    print("Enter the number to find the multiplication table :")
    val num: Int= readLine()!!.toInt()

    for (i: Int in 1..10) {
        val multiply = num * i
        println("$num * $i = $multiply")
    }
}
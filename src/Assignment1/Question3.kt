package Assignment1

fun main() {
    print("Enter a number: ")
    val num: Int = readLine()!!.toInt()
    checkpnz(num)
}
fun checkpnz(num:Int){
    if (num<0)
        print("The number is negative")

    else if(num==0)
        print("Number is 0")

    else
        print("The number is positive")

}
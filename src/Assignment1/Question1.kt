package Assignment1

fun main() {
    print("Enter a number: ")
    val num: Int = readLine()!!.toInt()
    checkGreaterornot(num)
}
fun checkGreaterornot(num:Int){
    if (num<100)
        print("The number is less than 100")

    else if(num==100)
        print("Number is 100")

    else
        print("The number is greater than 100")

}
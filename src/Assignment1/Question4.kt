package Assignment1

fun main(){
    print("Enter monthly salary: ")
    val salary:Int= readLine()!!.toInt()

    if (salary>200000)
        print("You have to pay tax")
    else
        print("You don't have to pay tax")

}
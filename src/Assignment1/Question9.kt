package Assignment1

fun main(){
    print("Enter the starting number : ")
    val start:Int= readLine()!!.toInt()

    print("Enter the ending number : ")
    val end:Int= readLine()!!.toInt()

    for (start: Int in start..end){
        if (start%2==0)
            println("$start")
    }


}

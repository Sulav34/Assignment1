package Assignment1


fun main(){
    val arr = IntArray(5)

    for (i in arr.indices) {
        print("Enter the Element : ")
        arr[i] = readLine()!!.toInt()
    }
    evenSum(arr)
}
fun evenSum(arr: IntArray){
    var sum=0
    for(i in arr.indices)
        if(i%2==0){

            sum = sum + i
            println("Even numbers are : $i")
        }

    println(" Sum of Even numbers is : $sum ")

}
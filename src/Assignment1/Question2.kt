package Assignment1

fun main(){
    print("Enter what day is today: ")
    val day = readLine()!!

    when(day){
        "saturday","SATURDAY" ->
            print("It is a happy holiday")
        else ->
            print("It is a week day")

    }

}
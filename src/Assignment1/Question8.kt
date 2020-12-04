package Assignment1


fun main(){
    print("Enter the monthly salary :")
    val monthlySalary:Int= readLine()!!.toInt()

    val yearlySalary:Int= monthlySalary * 12

    println("yearly salalry is $yearlySalary")

    calculatedTax(yearlySalary)
}

fun calculatedTax(yearlySalary: Int) {
    if (yearlySalary <= 200000) {
        val salary:Float=(1f / 100) * yearlySalary
        print("The total Salary after Tax deduction is $salary")
    }
    else if (yearlySalary >= 200000 || yearlySalary < 350000) {
        val salary:Float= (1f / 100) *yearlySalary + (yearlySalary - 200000) * (15f / 100)
        print("The total Salary after Tax deduction is $salary")
    }
    else if (yearlySalary >= 350000){
        val salary:Float= (1f/100)*yearlySalary + (yearlySalary - 200000) * (15f/100) + (yearlySalary - 350000) * (25f/100)
        print("The total Salary after Tax deduction is $salary")
    }
}
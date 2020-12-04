package Assignment1


fun main(){
    val words=arrayOf("computer","software","hardware","significant","convert")
    val meanings=arrayOf("an electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program..",
        "the programs and other operating information used by a computer..",
        "the machines, wiring, and other physical components of a computer or other electronic system.",
        "sufficiently great or important to be worthy of attention.",
        "to change (something) into a different form or properties.")
    val dictionaryMap= mapOf<String,String>("data" to "an electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program the programs and other operating information used by a computer..",
        "software" to "the programs and other operating information used by a computer..",
        "hardware" to "the machines, wiring, and other physical components of a computer or other electronic system.",
        "significant" to "sufficiently great or important to be worthy of attention.",
        "convert" to "to change (something) into a different form or properties.")

    print("Enter a word: ")
    val wrd= readLine()!!
    println("$wrd meaning is : ${dictionaryMap[wrd]}")
}
fun main(args: Array<String>) {

    println("Please enter the number: ")
    var num1: Int = readLine()!!.toInt()

    println("Please enter number")
    var num2: Int = readLine()!!.toInt()

    var res = num1*num2

    println("Result: " + res)

    ++num1
    num2++

    res = num1*num2

    println("Result: " + res)

}
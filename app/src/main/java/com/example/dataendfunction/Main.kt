package com.example.dataendfunction

fun main (args: Array<String>){
    var num = 50

    var multid = Array<Array<Array<Array<Int>>>>(2) {
        Array<Array<Array<Int>>>(2) {
            Array<Array<Int>>(2) {
                Array<Int> (2) {num ++}
            }
        }
    }
    var arr = multid[0][0][0][0]
    println(arr)


    myFirstFunction()
    val result1 = myFirstFunction2(1)
    println(result1)
    val result2 = myFirstFunction4(2, 3.5)
    println(result2)

    printSalam("SALAM")
    val result3 = addTwoNumbers(first = 2, second = 8)
    println(result3)
    val result4 = addTwoNumbers(second = 5, first = 15 )
    println(result4)
    val result5 = addNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(result5)
    val result6 = addTwoNumbers(1)
    println(result6)
    val sum = result1 + result2 + result3 + result4 + result5 + result6
    println(sum)
    println(convertSpacesToUnderscores("KAK DELA ?!"))
}

fun myFirstFunction(): Int{
    return 1
}
fun myFirstFunction2(a: Long): Int{
    return a.toInt()
}
fun myFirstFunction3() =//mojno bez nnichego pustaya
    Unit
fun myFirstFunction4(a: Long, b: Double) = a * b




fun printSalam(s: String) {
    println("salam")
}
fun addTwoNumbers(first: Int, second: Int = 0): Int {
    return first + second
}
fun addNumbers(vararg number: Int): Int {
    return number.sum()
}

fun convertSpacesToUnderscores(str: String): String {
    return str.replace(" ", "_")
}
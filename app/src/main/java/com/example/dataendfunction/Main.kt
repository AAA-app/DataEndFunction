//package com.example.dataendfunction
//
//import android.graphics.drawable.shapes.Shape
//
//fun main (args: Shape1<String>){
//    var num = 10
//
//    var multiD = Array<Shape<Shape1<Shape1<Int>>>>(2) {
//        Array<Shape1<Shape<Int>>>(2) {
//            Array<Shape1<Int>>(2) {
//                Array<Int> (2) {num ++}
//            }
//        }
//    }
//    multiD[0][0][0][1] = 200
//    var arr = multiD[0][0][0][1]
//    println(arr)
//    for (i in 0..1) {
//        for (j in 0..1) {
//            for (k in 0..2) {
//                for (m in 0..1) {
//                    print(multiD[i][j][k][m])
//                    print(" ")
//
//                }
//            }
//        }
//    }
//
//
//    myFirstFunction()
//    val result1 = myFirstFunction2(1)
//    println(result1)
//    val result2 = myFirstFunction4(2, 3.5)
//    println(result2)
//
//    printSalam("SALAM")
//    val result3 = addTwoNumbers(first = 2, second = 8)
//    println(result3)
//    val result4 = addTwoNumbers(second = 5, first = 15 )
//    println(result4)
//    val result5 = addNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    println(result5)
//    val result6 = addTwoNumbers(1)
//    println(result6)
//    val sum = result1 + result2 + result3 + result4 + result5 + result6
//    println(sum)
//    println(convertSpacesToUnderscores("KAK DELA ?!"))
//}
//
//fun myFirstFunction(): Int{
//    return 1
//}
//fun myFirstFunction2(a: Long): Int{
//    return a.toInt()
//}
//fun myFirstFunction3() =//mojno bez nnichego pustaya
//    Unit
//fun myFirstFunction4(a: Long, b: Double) = a * b
//
//
//
//
//fun printSalam(s: String) {
//    println("salam")
//}
//fun addTwoNumbers(first: Int, second: Int = 0): Int {
//    return first + second
//}
//fun addNumbers(vararg number: Int): Int {
//    return number.sum()
//}
//
//fun convertSpacesToUnderscores(str: String): String {
//    return str.replace(" ", "_")
///}
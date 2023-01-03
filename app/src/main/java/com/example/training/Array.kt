package com.example.training


fun main() {
    // TODO: Assignment 3: Arrays.
    val assignment = arrayListOf(10.0, 4.6, 35.4, 16.9, 24.23)
    var avg = 0.0
    for (i in assignment)
        avg += i
    println(avg / assignment.size)

}

// TODO: Assignment 3: Functions.
fun mathOp(num1: Double, num2: Double, operator: String = "+") =
    when (operator) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        else -> println("Please Enter a Valid Mathematical Operation")
    }




package com.example.training

import kotlin.math.roundToInt
import kotlin.random.Random


fun main() {
    // TODO: Assignment 3: Arrays.
    val assignment = arrayListOf<Double>()
    for ( i in 1..5) assignment.add(Random.nextDouble(1.0,100.0))
    val avg = assignment.sum()
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





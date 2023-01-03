package com.example.training

fun main(){
    // TODO: Assignment 1 What is the result of the following?
    /*
    * false && false -> false
    * 10 % 3 -> 1
    * 5 >= 5 -> true
    * false || true -> true
    * 5-3*2 -> -1
    * 3 != 2 -> true
    * (6+6) / 3 -> 4
    * */
    // TODO: Assignment 2
    // Part 1
    for(i in 0..100) {
        if (i == 71) {
            println("IT'S OVER 70!!!")
            break
        } //else println(i)
    }
    var names  = arrayListOf("Hi", "Hello", "SARa")
    if("sara".equals("Sara",true)) {
        println(names)
    }
    // Part 2
    var temperature = 35
    while(temperature > 10 ){
        when (temperature) {
            30 -> println("It's Hot")
            20 -> println("It's comfy")
            15 -> println("It's Cold!!!")
        }
            temperature--
    }
}


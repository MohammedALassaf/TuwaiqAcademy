package com.example.training

class Car(Name: String, Brand: String, Model: Int) {
    var speed = 0
        private set
    private var carOn =false
    fun accelerateCar(acceleration:Int){
        println("The current Speed: $speed")
        println("Acceleration: $acceleration")
        speed += acceleration

        println("The total speed: $speed")
    }
    fun initCar(newInit:Boolean){
        carOn=newInit
    }
    init {
//        println("Car name is $Name, Brand is $Brand, Car Model is $Model")
    }
}

class Fruits( color: String, name: String) {
    var fruitName = name
    var size = 500
    var fruitColor = color
    fun changeColor(newColor: String) {
        fruitColor = newColor
    }
    fun changeName(newName:String){
        fruitName = newName
    }

}

    class Person{
        private var name = " "
        private var age = 0

        fun getName() = name
        fun setName(newName:String){ name =newName}
        fun setAge()  = age

    }
data class Teacher(val name: String, var age:Int , var teach:String, var isWorking: Boolean, val height: Int = 200)

fun main(){
    var Car1 = Car("S500", "Mercedes", 2021)
    var Car2 = Car("LX570", "Lexus", 2022)
    var Car3 = Car("CX9", "Mazda", 2018)
    Car1.accelerateCar(30)
    Car1.accelerateCar(20)
    val teacher = Teacher("Mohammed", 40 , "Math", true)
    println(teacher.hashCode())
    var x = readln()
//    var banana = Fruits("Yellow", "Banana")
//    var apple = Fruits("Red", "Apple")
//    println(apple.fruitColor)
//    apple.changeColor("Green")
//    println(apple.fruitColor)
//    println(banana.fruitColor)
}

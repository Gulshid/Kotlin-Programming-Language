package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var mycar = Cars();
    mycar.name = "Ferarri"
    mycar.model = 2021

    var mycar_2  = Cars();
    mycar_2.name = "Mercedes"
    mycar_2.model = 2023;

    println("The Car is ${mycar.name} and the model is ${mycar.model}")
    println("The Car is ${mycar_2.name} and the model is ${mycar_2.model}")

    println("-------------------")
    println("Now this time constructor call directly")
    var mycar_3 = MyCars("Bogatti", 2021)
    println("${mycar_3.name} and ${mycar_3.model}")

    var secondcar = MysecondCar("BMW", 2025)
    println("The name of car is : ${secondcar.name} and model is : ${secondcar.model}")
}
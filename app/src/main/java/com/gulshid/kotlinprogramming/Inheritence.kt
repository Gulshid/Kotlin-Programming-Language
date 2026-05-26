package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {

    //Creating object for Car class
    var c = car()
    c.type = " Car "
    c.model = " Ferarri "
    c.maxspeed = 320

    c.show();
    println("\n")
    //Creating object for Motor class
    var motor = motocycle()
    motor.type = "Motorcycle"
    motor.model = "yamaha"
    motor.maxspeed = 180

    motor.show()



}
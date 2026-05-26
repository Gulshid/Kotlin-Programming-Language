package com.gulshid.kotlinprogramming.override

fun main(args: Array<String>) {
    // Create an Object for Vehicle Class
    var vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate(340)
    vehicle.stop()

    println("\n")
    // Create an Object for Car Class
    var car = Cars()

    car.superStart()
    car.superAccelerate()
    car.superstop()

    println("\n")
    car.start()
    car.accelerate(300)
    car.stop()
}
package com.gulshid.kotlinprogramming.interfaces

fun main(args: Array<String>) {
    var vehicle = Vehicle()
    println("Vehicle name : ${vehicle.name} ")
    vehicle.go()
    vehicle.stop()
}

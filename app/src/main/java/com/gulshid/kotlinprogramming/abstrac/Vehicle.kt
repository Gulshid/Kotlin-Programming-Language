package com.gulshid.kotlinprogramming.abstrac

abstract class Vehicle {
    // Abstract class
    abstract fun Vehicle(name: String) : String

    // non Abstract class
    fun VehicleType(type: String) : String{
        return type
    }

    // abstract property
    abstract var model: Int

    // non abstract property
    var speed : Int? = null


}
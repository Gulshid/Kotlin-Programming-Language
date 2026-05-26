package com.gulshid.kotlinprogramming.interfaces

class Vehicle: CanGo, CanStop {
    override val name: String
        get() = "Ferarri"

    override fun stop(){
        println("Vehicles can stop")
    }

}
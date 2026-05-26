package com.gulshid.kotlinprogramming.abstrac

class Cars(override var model: Int): Vehicle() {
    fun VehicleName(name: String): String {
        return name
    }

    override fun Vehicle(name: String): String {
        TODO("Not yet implemented")
    }

}
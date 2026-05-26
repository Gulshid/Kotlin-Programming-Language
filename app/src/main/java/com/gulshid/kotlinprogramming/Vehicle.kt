package com.gulshid.kotlinprogramming

open class Vehicle {
    var type : String? = null
    var model : String? = null
    var maxspeed : Int? = null

    fun show(){
        print("type is : $type")
        print("model is : $model")
        print("maxspeed is : $maxspeed")
    }
}
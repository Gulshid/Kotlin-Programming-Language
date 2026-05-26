package com.gulshid.kotlinprogramming.override

open  class Vehicle {
    open fun start(){
        println("Vehicle has  Started")
    }

    open fun accelerate(speed : Int){
        println("Vehcile Speed at : $speed")
    }

    open fun stop(){
        println("Vehicle has stopped")
    }


}
package com.gulshid.kotlinprogramming.override

class Cars : Vehicle(){

    fun superStart(){
        super.start()

    }

    fun superAccelerate(){
        super.accelerate(90)

    }

    fun superstop(){
        super.stop()
    }



    override fun start(){
        println("Cars has  Started")
    }

    override fun accelerate(speed : Int){
        println("Cars Speed at : $speed")
    }

    override fun stop(){
        println("Cars has stopped")
    }
}
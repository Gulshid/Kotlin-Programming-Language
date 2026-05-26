package com.gulshid.kotlinprogramming.abstrac

fun main(args: Array<String>) {
//    var vehicle = Vehicle()

    var car = Cars(2021)
    car.speed = 300

    println("Name of Vehicle :" +

            " ${car.VehicleName("BMW")} \n " +
            "TYpe : ${car.VehicleType("Car")} \n" +
            " Model : ${car.model} \n" +
            " Speed : ${car.speed}"  )



}
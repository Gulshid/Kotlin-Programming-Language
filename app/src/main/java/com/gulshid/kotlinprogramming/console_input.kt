package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    print("What's your Name :?");
    var name : String? = readLine();

    println("How Old are You :?")
    var age : Int = readLine()!!.toInt();

    println("The Name is : ${name} and Age is : ${age}");
}
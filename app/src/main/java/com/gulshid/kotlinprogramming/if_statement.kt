package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    print("Enter the Number :")
    var n : Int = readLine()!!.toInt();

    if (n % 2 == 0){
        println("$n is Even Number ");
    }
    else{
        print("$n is Odd Number ");≠
    }
}
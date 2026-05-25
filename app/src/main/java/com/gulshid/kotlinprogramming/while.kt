package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var i = 10
    while (i >= 1){
        print("$i ")
        i -=1
    }


    print("");
    println("---------------");

    // fact
    var k = 1
    var fact = 1

    while(k < 6){
        fact *= k
        println("$k! = $fact ")
        k++
    }
}
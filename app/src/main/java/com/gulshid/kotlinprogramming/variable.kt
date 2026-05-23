package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var a = 3;
    var b = 5;
    var c = a + b;
    println(c);  // after display it swipe to next line
    print(c); // after display no next line
    println();

    // mutable variable => that can change
    // now Compare between var and val
    var age = 10;
    age = 30; // we can re use and value assign
    println(age);


    // immutable variable => that does not change
    val year = 2020;
    //    year = 2019; => we cant do re use variable of type val
    println(year);




//    val
}
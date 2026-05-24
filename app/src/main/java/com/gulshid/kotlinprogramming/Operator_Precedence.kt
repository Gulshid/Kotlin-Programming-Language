package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var result : Int = 5 + 2 * 3; // first multiply then add
    println("Result is : " + result);

    result  = (5 + 2) * 3; // first cal and solve the bracket add and then multiply
    println("Result is : " + result);

    println("----------------");

    var a : Int = 8;
    var b : Int = 4;
    var c : Int = 2;
    var sum : Int = 0;

    sum = a + --b + --c;
    println(sum);




}
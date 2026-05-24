package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    // RangeTo function and In Operator
    var myCharRange = 'a'.rangeTo('k');

    var mychar = 'k' in myCharRange;

    println("Mychar Range k  :" + mychar);

}
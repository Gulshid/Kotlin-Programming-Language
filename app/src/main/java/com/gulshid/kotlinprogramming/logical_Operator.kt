package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var a : Int = 3;
    var b : Int = 6;
    var c : Int = 4;

    var res : Boolean = false;


    println("---- Logical Operator ------");
    res = (a > b) && (a > c);
    println("Logical && : ${res} ");

    res = (a > b) || (a > c);
    println("Logical || : ${res} ");

    res = !(a > b);
    println("Logical ! : ${res} ");

}
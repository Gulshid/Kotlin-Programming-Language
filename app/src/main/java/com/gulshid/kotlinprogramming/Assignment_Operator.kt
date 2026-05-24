package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var a : Int = 2;
    var b : Int = 3;
    var c : Int = 0;

    // Arthematic and Assignment Operator
    println("------ Arthematic and Assignment Operator --------");

    println("----- Assignment Operator -----");
    c = a + b;
    println("c = a + b : ${c}");

    println("----- Arthematic $ Assignment Operator -----");
    c += a;
    println("c += a : ${c}");

    println("----- Subtraction $ Assignment Operator -----");
    c -= a;
    println("c -= a : ${c}");


    println("----- Multiplication  $ Assignment Operator -----");
    c *= a;
    println(" c *= a : ${c}");

    println("----- Division Assignment Operator -----");
    c /= a;
    println("c /= a : ${c}");

    println("----- Modulus Assignment Operator -----");
    c %= a;
    println("c %= a : ${c}");









}
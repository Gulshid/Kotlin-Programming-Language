package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var num_1 : Double = 2.4;
    var num_2 : Double = 3.2;
    var res : Double = 0.0;

    println("---- Arthematic Operation ---------");
    println("------- Additon -------");
    res = num_1 + num_2;
    println("${num_1} + ${num_2} : ${res}");

    println("------- Subtraction -------");
    res = num_1 - num_2;
    println("${num_1} - ${num_2} : ${res}");

    println("------- Multiplication -------");
    res = num_1 * num_2;
    println("${num_1} * ${num_2} : ${res}");

    println("------- Division -------");
    res = num_1 / num_2;
    println("${num_1}  /  ${num_2} : ${res}");

    println("------- Modulus -------");
    res = num_1 % num_2;
    println("${num_1} % ${num_2} : ${res}");


}
package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    // This is a Array List
//    var setArray = arrayListOf<Any>("Kotlin", 2, 3.4, true,'G', "Kotlin");
//
//    println(setArray.size);
//    println(setArray.last());

    // This is Set Collection
    // Remember on thing that in ArrayList we add same value element but in Set we cant it will not be stored
    var setArray = setOf<Any>("Kotlin", 2, 3.4, true,'G', "Kotlin");

    println(setArray.size);
    println(setArray.last());





}
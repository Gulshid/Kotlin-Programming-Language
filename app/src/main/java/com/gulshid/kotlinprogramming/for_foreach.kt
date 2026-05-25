package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    for (number in 1..20){
        print("$number ")
    }
    println();
    println("------------")

    var sum : Int = 0;

    for(n in 0..5){
        sum += n
    }
    print("$sum")

    println();
    println("------------")
    var add : Int = 0;

    for(n in 0..5){
        println(n)
        add += n
    }
    println("The Sum of number is : $add");

    println();
    println("------Even Number ------")
    var e : Int = 0;
    for(a in 1..10){
        if(a % 2 == 0){
            e += a;
            print("$a  ")
        }
    }
    println("The sum of Even  Number is : $e")



    println();
    println("------Odd Number ------")
    var o : Int = 0;
    for(a in 1..10){
        if(a % 2 == 1){
            o += a;
            print("$a  ")
        }
    }

    println("The sum of Odd Number is : $o")

    println();
    println("------------")

    var array_1 = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (s in array_1){
        print("$s ");
    }

    println();
    println("------------")

    var array_2 = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (s in 0..(array_2.size) - 1){
        println("   [$s]  = ${array_2[s]} ");
    }

    println();
    println("------------")

    var array_3 = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (s in array_3.indices){
        println("   [$s]  = ${array_2[s]} ");
    }

    println();
    println("------------")
    var array_4 = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    array_4.forEach { println(it) }
}
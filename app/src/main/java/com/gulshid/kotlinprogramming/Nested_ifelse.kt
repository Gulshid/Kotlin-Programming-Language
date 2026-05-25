package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    print("Enter any  Numbers :")
    var a : Int = readLine()!!.toInt();

    if(a >= 0){
        if (a > 0){
            print("The value $a of a is greater than Zero")
        }
        else{
            print("The value $a of a is equal to Zero")
        }
    }
    else{
        print("The value $a of a is less than Zero ")
    }

}
package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    print("Enter Your Age :")
    var age : Int = readLine()!!.toInt();

    if(age < 13){
        print("Your a CHild")

    }else if (age < 19){
        print("Your a Teen age ")

    }else{
        if(age < 65){
            print("Your a Adult")
        }else{
            print("Your a Old Person")
        }

    }
}
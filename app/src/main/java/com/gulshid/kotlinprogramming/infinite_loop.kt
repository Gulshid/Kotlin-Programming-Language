package com.gulshid.kotlinprogramming

import kotlin.random.Random

fun main(args: Array<String>) {
    val num = Random.nextInt(0, 100);

    print("Please enter any Number :")
    while (2 > 1){
        val userguess : Int = readLine()!!.toInt();

        if(userguess == num){
            print("Congratulations! You guessed a value")
            break
        }else if(userguess < num){
            print("Increase Your Guess Number ")
        }else if(userguess > num){
            print("Decrease! Your Guess Number")
        }

    }
}
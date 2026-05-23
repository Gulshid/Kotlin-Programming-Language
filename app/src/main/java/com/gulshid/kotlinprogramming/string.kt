package com.gulshid.kotlinprogramming

import androidx.compose.ui.text.toUpperCase

fun main(args: Array<String>) {
    var s1 : String = "Hello Kotlin";
    var s2 : String = "Language";
    println(s1 + " " + s2); // Concat function

    var s3 : String = "Kotlin";
    var i : Int = s3.length; // length of string
    println("The length of "+ s3 + " is "+i);

    var b : Boolean = s3.equals("Kotlin"); // check the s3 = b means check the string if equal then true return otherwise false
    println(b);

    println(s3.isEmpty()); // check if the variable is empty or not ==> true / false

    println(s3.plus(" Language")); // concat the two variables

    println(s3.toLowerCase()); // convert to lowercase
    println(s3.toUpperCase()); // convert to uppercase

    var s : String = "    Android   ";
    println(s3 + s);
    println(s3 + s.trim()); // space remove using trim







}
package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    // Set is immutable and arrayList is mutable
    var age = mapOf<String, Int>("David" to 20, "Ronaldo" to 25);
    println("------ immutable --------");
    println("The Age of David is : ${age["David"]}  and Ronaldo is : ${age["Ronaldo"]}");
    // Or
    println("The Age of David is : ${age["David"]}");
    println("The Age of Ronaldo is : ${age["Ronaldo"]}")

    println("------ mutable --------");
    var age_person = mutableMapOf<String, Int>("David" to 20, "Ronaldo" to 25);
    age_person.put("buffon" , 30);
    println("The Age of David is : ${age_person["David"]}");
    println("The Age of Ronaldo is : ${age_person.get("Ronaldo")}");
    println("The Age of Buffon is : ${age_person["buffon"]}");

}
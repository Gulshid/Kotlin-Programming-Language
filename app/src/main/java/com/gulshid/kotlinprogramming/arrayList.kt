package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    var age = ArrayList<Int>();

    // add element in arraylist
    age.add(10); // we use element (which  is required)
    age.add(1,4); // and we use index and element both but element is required
    age.add(5);

    age.add(3, 6);

    println("------------------");
    println("The first index is : " + age[0]);
    println("The second index is : " + age[1]);
    println("The thired index is : ${age[2]}"); // we also specified variable inside string using dollar
    println("The fourth index is : " + age.get(3));
    println(age.size);
    println("------------------");

    // Remove element from  arraylist
    age.remove(4);
    println("The first index is : " + age[0]);
    println("The second index is : " + age[1]);
    println("The thired index is : ${age[2]}"); // we also specified variable inside string using dollar

    println(age.size);
    println("------------------");

    var cars = arrayListOf<String>("Mercedes", "BMW");
    cars.add(2, "Honda");


    println("The Car at index 0 :${cars[0]}");
    println("The Car at index 1 :${cars[1]}");
    println("The Car at index 2 :${cars[2]}");

    println("------------------");

    var myMaxArraylist = ArrayList<Any>();
    myMaxArraylist.add("FOrd");
    myMaxArraylist.add(5);
    myMaxArraylist.add(2.4);
    myMaxArraylist.add(true);
    myMaxArraylist.add('G');

    println("The Value at index 0 : ${myMaxArraylist[0]}");
    println("The Value at index 1 : ${myMaxArraylist[1]}");
    println("The Value at index 2 : ${myMaxArraylist[2]}");
    println("The Value at index 3 : ${myMaxArraylist[3]}");
    println("The Value at index 4 : ${myMaxArraylist[4]}");









}
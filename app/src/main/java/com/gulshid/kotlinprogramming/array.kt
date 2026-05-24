package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    // Integer Array
    var age = arrayOf(10,12,20,34,40);

    println("The Age of at index 0=>2=>1=>3=>4 :" +
            age[0] + " " +  age[2] + " " + age[1] +" " + age[3] + " " + age[4]);


    // Or
    println("The index 0 value : " + age[0]);
    println("The Index 1 value : " + age[1]);
    println("The Index 2 value : " + age[2]);
    println("The Index 3 value : " + age[3]);
    println("The Index 4 value : " + age[4]);

    // and we also this use
    println("The value at index 3 :"+ age.get(3));
    println("--------------------------");
    // =====================
    // String / char Array
    var cars = arrayOf("Mercedes", "BMW", "HONDA");
    println("The index 0 car is  : " + cars[0]);
    println("The Index 1 car is  : " + cars[1]);
    println("The Index 2 car is  : " + cars[2]);

    println("--------------------------");
    // if we want to change its value
    cars.set(2, "FORD");
    println("The index 0 car is  : " + cars[0]);
    println("The Index 1 car is  : " + cars[1]);
    println("The Index 2 car is  : " + cars[2]);

    println("--------------------------");

    // if we want a size of array
    println("The Size of Array of age :" + age.size);
    println("The Size of Array of car :" + cars.size);

    println("--------------------------");
    // if we want mix of type of value array
    var ageAndCar = arrayOf(10, "Mercedes", 34, "FORD");
    println("The index 0  is  : " + ageAndCar[0]);
    println("The Index 1  is  : " + ageAndCar[1]);
    println("The Index 2  is  : " + ageAndCar[2]);
    println("The Index 3  is  : " + ageAndCar[3]);

    // set the value in ageAndSet  Array
    ageAndCar.set(3, "40");
    println("--------------------------");

    println("The index 0  is  : " + ageAndCar[0]);
    println("The Index 1  is  : " + ageAndCar[1]);
    println("The Index 2  is  : " + ageAndCar[2]);
    println("The Index 3  is  : " + ageAndCar[3]);

}
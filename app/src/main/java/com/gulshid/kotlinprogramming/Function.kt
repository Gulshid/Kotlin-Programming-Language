package com.gulshid.kotlinprogramming

fun main(args: Array<String>) {
    println(addtwo(2,3))
    show(3,4);
    println()
    var f = findMinNumber(4,5);
    print("the minimium number is : $f")




}

fun addtwo(x:Int, y:Int): Int{
    var sum = 0
    sum = x + y
    return sum
}

fun show(num_1:Int, num_2:Int) {
    print("You entered $num_1 and $num_2")
}

fun findMinNumber (n_1:Int, n_2:Int): Int{
    var minimium :Int
    if(n_1 > n_2){
        minimium = n_2
    }
    else {
        minimium = n_1
    }


   return minimium
}

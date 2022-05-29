package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    // Lambda function 1
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(10,5))

    // Lambda function 2
    val sum2 = {a: Int, b: Int -> println(a+b)}
    sum2(10,5)
}

// Normally function
fun addNumber(a:Int, b:Int){
    val add = a + b
    println(add)
}
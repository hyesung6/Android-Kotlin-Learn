package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    myFunction()
    print("\nresult is ${avgUp(1.5,2.4)}")
}

fun avgUp(a: Double, b: Double) : Double{
    return (a + b) / 2
}

fun myFunction(){
    print("Called from myFunction")
}
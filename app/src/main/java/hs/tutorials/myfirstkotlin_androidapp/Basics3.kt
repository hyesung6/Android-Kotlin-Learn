package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    var season = 3
    when(season){
        1 -> println("spring")
        2 -> println("summer")
        3 -> {println("fall")
            println("autumn")}
        4 -> println("winter")
        else -> println("unknown season")
    }

    var month: Int = 3
    when(month){
        in 3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 9..11 -> println("autumn")
        12, 1, 2 -> println("winter")
        !in 1..12 -> println("unknown season") // !in 은 != 와 같음
    }

    var x : Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is an Double")
        is String -> println("$x is an String")
        else -> println("$x is none of the above")  // 위에서 한 번 걸리면 밑의 코드는 실행 x
    }

    var untilZero = 100
    while(untilZero > 0){
        println(untilZero)
        untilZero--
    }
    println("We find Zero")
}
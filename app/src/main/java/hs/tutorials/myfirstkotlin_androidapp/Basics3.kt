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


    // while 문은 while 탈출 시 1회 실행됨.
    x = 1
    do{
        print("$x")
        x++
    }while (x <= 10)
    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        println("[Temp : $roomTemp] it's cold...")
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "Comfy"
            println("[Temp : $roomTemp] it's comfy now")
        }
    }

    for(num in 1..10){
        println("$num") // ..은 1부터 10 포함
    }

    for(i in 1 until 10){
        println("$i") // until은 1부터 10 포함 x
    }

    for(i in 10 downTo 1 step 2){
        println("$i")
    }

    var q = 0
    while(q <= 9000){
        q++
        if(q > 9000){
            println("IT'S OVER 9000!!!")
        }
    }

    for(i in 1..19){
        if(i/2 ==5){
            continue
        }
        print("$i")      // 정수형을 나눴을 때 소수가 나오면, 소수점 뒤는 무시됨 , 5.5 -> 5
    }
}
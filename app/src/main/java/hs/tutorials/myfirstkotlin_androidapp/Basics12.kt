package hs.tutorials.myfirstkotlin_androidapp

fun main() {
//    val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
//    val numbers = intArrayOf(1,2,3,4,5,6)

    // 타입 추론을 이용한 가장 쉬운 배열 선언 ( 자료형을 정해주지 않아도 됨 )
    val numbers = arrayOf(1,2,3,4,5,6)
    println(numbers)
    // array를 print로 출력하면 저장된 값이 아니라 주소값이 출력됨.
    // ==> 코틀린의 유틸리티 메서드로 불러와야 원하는 값을 불러올 수 있다.
    println(numbers.contentToString())
    for(element in numbers){
        print("${element+2} ")
    }
    println("\n${numbers[0]}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    println(numbers.contentToString())

    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))

    for(fruit in fruits){
        print("${fruit.name} ")
    }
    println()
    for(index in fruits.indices){   // indices : 배열의 index를 반환하는 메서드
        print("${fruits[index].name} is in index $index\n")
    }

    val mix = arrayOf("Sun", "Mon", "Tues", 1, 2, 3, Fruit("Grape",3.5))
    println(mix.contentToString())
}

/*
타입 추론해주는 편리한 arrayOf 가 있는데,
intArrayOf 등을 쓰는 이유? : 데이터베이스에 값을 전달할 때 코드가 바로 해결할 수 있음
 */

data class Fruit(val name: String, val price: Double)
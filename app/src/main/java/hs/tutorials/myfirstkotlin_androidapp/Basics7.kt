package hs.tutorials.myfirstkotlin_androidapp

import java.lang.IllegalArgumentException

//fun main() {
//    var myCar = Car()
//    println("brand is : ${myCar.myBrand}")
//    myCar.maxSpeed = 240
//    println("Maxspped is ${myCar.maxSpeed}")
//}


// lateinit 을 사용하여 init이 실행될 때 변수 초기화가 되게끔 할 수 있음
//class Car(){
//    lateinit var owner : String
//
//    val myBrand : String = "BMW"
        // Custom getter
//        get() {
//            return field.toLowerCase()
//        }
//
//    var maxSpeed : Int = 250
        // default getter
        // get() = field
//        set(value){
//            field = if(value > 0) value else throw IllegalArgumentException("Maxspeed can't be less than 0")
//        }

    // private : 이 클래스에서만 사용
    // 아래와 같이 private set 하면 set에 대해서만 외부에서 비공개이므로
    // 값을 가져와 사용하는 다른 활동에는 사용 가능
//    var myModel : String = "M5"
//        private set
//
//    init {
//        this.myModel = "M3"
//        this.owner = "Frank"
//    }
//}
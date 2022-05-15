package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
    var myPhone = MobilePhone()
}

// (firstName: String = "John", lastName: String = "Doe")  처럼 패러미터의 디폴트를 지정해줄 수 있음
// 패러미터를 안 넣고 Person() 만 실행하면 디폴트 패러미터로 실행
// constructor() --> 보조 생성자 : 객체 생성 시 값을 추가하게 해줌
class Person (firstName: String = "John", lastName: String = "Doe"){
    // Initializer Block
    init {
        println("Initialized a new Person object with " +
                "fistName = $firstName and lastName = $lastName")
    }
}



class MobilePhone (osName: String = "Android", brand: String = "Samsung", model: String = "Galaxy S20 Ultra"){
    init {
        println("Your MobilePhone : $osName - $brand $model")
    }
}
package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    // Creating instances of classes
    var denis = Person("Denis", "Panjuta", 31)
    denis.hobby = "to skateboard"
    denis.age = 32
    println("Denis is ${denis.age} years old")
    denis.stateHobby()

    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()
//    var john = Person()
//    var johnPeterson = Person(lastName = "Peterson")
//    var myPhone = MobilePhone()
}

// (firstName: String = "John", lastName: String = "Doe")  처럼 패러미터의 디폴트를 지정해줄 수 있음
// 패러미터를 안 넣고 Person() 만 실행하면 디폴트 패러미터로 실행
// constructor() --> 보조 생성자 : 객체 생성 시 값을 추가하게 해줌
class Person (firstName: String = "John", lastName: String = "Doe"){
    // Member Variable - Properties
    var age : Int? = null
    var hobby : String = "Watch Netflix"
    var firstName : String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "fistName = $firstName and lastName = $lastName and age = $age")
    }

    // Member secondary Constructor
    // 생성할 때 생성자에 전달된 age 값이 this 클래스의 age 값으로 지정돼야 함
    // this는 주 생성자에서 값 받음, 즉 주 생성자를 상속 받아 추가하고 싶은 멤버 변수를 오버라이딩 하는 셈
     constructor(firstName: String, lastName: String, age : Int):
            this(firstName, lastName){
                this.age = age
            }


    // Member functions - Methods
    fun stateHobby(){
        println("${firstName}'s hobby is $hobby")
    }
}



class MobilePhone (osName: String = "Android", brand: String = "Samsung", model: String = "Galaxy S20 Ultra"){
    init {
        println("Your MobilePhone : $osName - $brand $model")
    }
}
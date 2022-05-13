package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    //    null 값이 필요한 경우를 위해 nullable 변수를 지원
    var name :String = "Denis"
    //    name = null -> Compilation Error
    var nullableName : String? = "Denis"
    //    nullableName = null    -> 가능

    var len = name.length
    var len2 = nullableName?.length
    nullableName?.let {println(it.length)}

    //    ? : Elvis operator
    val names = nullableName ?: "Guest"
    //    println("name is $names")

    println(nullableName!!.toLowerCase())

    //    val wifesAge: String? = user?.wife?.age ?: 0
    //    user 클래스의 age 객체가 null 인지 아닌지 호출&확인 가능
}
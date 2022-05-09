package hs.tutorials.myfirstkotlin_androidapp

fun main(){
    var className : String = "Android Masterclass"
    val tmpFloat : Float = 13.37F
    val pi : Double = 3.14159265358979
    var age : Byte = 25
    var year : Short = 2020
    var unknownNum : Long = 18881234567
    var isHungry : Boolean = true
    var firstChar : Char = 'a'


}

// var로 선언한 변수는 이후에 다른 값으로 선언 가능 = mutable
// val로 선언한 변수는 다른 값으로 선언 불가능     = immutable

/*
주석 여러 줄에
걸쳐서 사용할 때
 */

// 코틀린은 타입 추론 기능이 있어서
// int, char, str 안 해도 var, val로 사용 가능

/*
Integer Types

Byte : 8 bit
Short : 16 bit
Int : 32 bit
long : 64 bit
 */

/*
Floating Point Types

Float : 32 bit
Double : 64 bit

코틀린은 Double을 자주 사용하므로 Float은 13.37F 등으로 F를 표기해줌
 */

/*
Characters Types

letterChar = 'A'
digitChar = '$'
 */

/*
strings

val myStr = "Hello World"
var firstCharInStr = myStr[0]
var lastCharInStr = myStr[myStr.length - 1]

print("first character : " + firstCharInStr)
print("last character : " + lastCharInStr)

 */
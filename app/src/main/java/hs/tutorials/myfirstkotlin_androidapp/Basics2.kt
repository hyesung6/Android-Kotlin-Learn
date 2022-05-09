package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    var result = 5 + 3
    result = result / 2
    print(result)

/*
위 코드를 보면,
Python의 fstring처럼 문자열 내에 변수 포매팅이 가능
기본은 $ 문자 뒤에 변수명을 붙이는 것이고,
해당 변수에 특정 함수를 사용한 채로 포매팅을 할 때는 중괄호{} 사용
 */

//    var result: Int = 5 + 3
//    result = result / 2
//    print(result)
//
//    var heightPerson1 = 170
//    var heightPerson2 = 180
//
//    if(heightPerson1 > heightPerson2){
//        println("use raw force")
//    }
//    else if(heightPerson1 == heightPerson2){
//        println("use your power technique 1337")
//    }
//    else{
//        println("use technique")
//    }

    val age = 17

    if (age >= 21) {
        println("now you may drink in the US")
    } else if (age >= 18) {
        println("you may vote now")
    } else if (age >= 16) {
        println("you may driving now")
    } else {
        println("you're too young")
    }

//   if(age >= 21)
//       println("now you may drink in the US")
//   처럼 {}중괄호를 안쓰고 바로 쓸 수도 있으나, 이 경우 그 밑에 오는 라인은 if문을 벗어난 코드가 됨

}

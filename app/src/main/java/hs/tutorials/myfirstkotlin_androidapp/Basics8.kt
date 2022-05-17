package hs.tutorials.myfirstkotlin_androidapp

// data class 는 추상, 오픈, 봉인, 내부 클래스일 수 없음
data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Denis")

    user1.name = "Michael"
    val user2 = User(1, "Michael")
    println(user1 == user2)
    println("User Details : $user1")

    // copy() : 바꾸고 싶은 변수를 빼고 복사할 수 있음
    val updatedUser = user1.copy(name="Denis Panjuta")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // prints Denis Panjuta

    val (id, name) = updatedUser
    println("id=$id, name=$name")
}
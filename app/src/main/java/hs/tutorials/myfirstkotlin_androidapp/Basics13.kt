package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    println(anyTypes.size) // 리스트에 들어있는 아이템의 갯수 반환
    println(months[1])

    for (month in months){
        print("$month ")
    }

    // 이뮤터블 리스트 months를 toMutableList()를 사용해 뮤터블 리스트로 선언,
    // 이후 뮤터블 리스트에 addAll(), add() 메서드 사용하여 새로운 아이템 추가
    val additionalMonth = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonth.addAll(newMonths)
    println("\n$additionalMonth")
    additionalMonth.add("July")
    println(additionalMonth)
    val newMonthsTwo = arrayOf("August", "September", "October", "November", "December")
    additionalMonth.addAll(newMonthsTwo)
    println(additionalMonth)

    val daysTwo = mutableListOf<String>("Mon", "Tue", "Wed")
    daysTwo.add("Thu")
    daysTwo[2] = "Sunday"
    println(daysTwo)
    daysTwo.removeAt(3)  // removeAt : 패러미터에 해당하는 인덱스의 값 삭제
    println(daysTwo)
    val removeList = listOf<String>("Mon", "Sunday")
    daysTwo.removeAll(removeList) // removeAll : 패러미터로 들어온 리스트의 값을 메서드 대상에서 삭제
    println(daysTwo)
}
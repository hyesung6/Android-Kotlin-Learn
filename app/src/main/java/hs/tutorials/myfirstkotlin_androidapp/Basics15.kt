package hs.tutorials.myfirstkotlin_androidapp

// ArrayLists ?
// 동적 배열을 이용한 컬렉션의 일종
// 특정 크기에 제한되지 않음
// 읽기와 쓰기 가능
// 삽입 시퀀스에 따름
// 비동기적이어서 중복 요소를 포함할 수 있음


fun main() {
    val testArrayList = ArrayList<Double>()
    var total1: Double = 0.0
    testArrayList.add(13.212312)
    testArrayList.add(23.151232)
    testArrayList.add(32.651553)
    testArrayList.add(16.223817)
    testArrayList.add(18.523999)
    println("--- print ArrayList ---\n${testArrayList}\n")
    for (i in testArrayList) {
        total1 += i
    }
    println("--- print ArrayList total ---\n${total1}\n")
    println("--- print ArrayList Avg ---\n${total1.div(testArrayList.size)}")
}


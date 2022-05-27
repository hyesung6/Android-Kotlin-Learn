package hs.tutorials.myfirstkotlin_androidapp

/*
인터페이스는 상태를 저장할 수 없고, 여러 인터페이스를 구현할 수 있지만
추상 클래스는 하나의 클래스에서만 상속이 가능

인터페이스는 생성자가 없지만
추상 클래스는 (추상이든 노멀 클래스든) 생성자가 있음

=> 추상 클래스는 필드와 생성자를 추가할 수 있음
*/

abstract class Pizza(private val size: String, private val price: Int){

    // 추상 프로퍼티 ( 서브 클래스에서 오버라이딩하여 사용 )
    abstract var tax: Int

    // 추상 메서드 ( 서브 클래스에서 오버라이딩하여 사용 )
    abstract fun knead()
    abstract fun bake()

    init {
        println("size : $size, price : $price")
    }
}

class CheesePizza(size: String, price: Int, override var tax: Int): Pizza(size, price){

    override fun knead() {
        println("Pizza is kneading...")
    }

    override fun bake() {
        println("Pizza is baking...")
    }


}

fun main() {
    val cheesePizza = CheesePizza("L", 10000, 1000)

    cheesePizza.knead()
    cheesePizza.bake()
}
package hs.tutorials.myfirstkotlin_androidapp


// Sub Class of Vehicle
open class Car(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}


// Sub Class of Car
class ElectricCar(name: String, brand: String, batteryLife: Double)
    : Car(name, brand){

    var chargerType = "type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    fun drive(){
        println("Drove for $range KM on electricity")
    }
}

fun main() {
    val audiA3 = Car("A3", "Audi")
    val teslaS = ElectricCar("S-Model", "Tesla", 85.0)
    teslaS.chargerType = "type2"
    teslaS.extendRange(200.0)

    teslaS.drive()

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}
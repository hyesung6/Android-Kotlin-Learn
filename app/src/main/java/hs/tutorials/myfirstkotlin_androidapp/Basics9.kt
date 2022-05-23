package hs.tutorials.myfirstkotlin_androidapp

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Sub Class of Vehicle
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}


// Sub Class of Car
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : Car(maxSpeed, name, brand){

    var chargerType = "type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

fun main() {
    val audiA3 = Car(200.0, "A3", "Audi")
    val teslaS = ElectricCar(240.0, "S-Model", "Tesla", 85.0)
    teslaS.chargerType = "type2"
//    teslaS.extendRange(200.0)

//    teslaS.drive()
    teslaS.brake()
    audiA3.brake()

    // Polymorphism
//    audiA3.drive(200.0)
//    teslaS.drive(200.0)
}
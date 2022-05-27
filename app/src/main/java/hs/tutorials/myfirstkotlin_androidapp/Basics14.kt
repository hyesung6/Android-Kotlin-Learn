package hs.tutorials.myfirstkotlin_androidapp

fun main() {
    val fruits = setOf("Orange", "Apple", "Grape", "Apple")
    print(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    print(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys){
        print("\n$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit("Grape", 2.5), "OK" to Fruit("Apple",1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    print(newDaysOfWeek.toSortedMap())
}

data class Fruit(val name:String, val price: Double)
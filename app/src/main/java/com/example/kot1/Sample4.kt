package com.example.kot1

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2021-02-09
 * @desc
 */


// Singleton pattern
object CarFactory {
    val Cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        Cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car1 = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(20)

    println(car1)
    println(car2)
    println(CarFactory.Cars.size.toString())

}
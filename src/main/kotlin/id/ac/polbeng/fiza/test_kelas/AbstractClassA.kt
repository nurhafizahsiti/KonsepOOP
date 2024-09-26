package id.ac.polbeng.fiza.test_kelas

import javax.xml.validation.ValidatorHandler

abstract class Vehicle(val name: String,
    val color: String,
    val weight: Double){
//   Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double
//    Abstract Methods (Must be implemented by Subclasses)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

//    concrete (Non Abstract) Method
    fun displayDetails(){
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}
class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
// Code to start a Car
        println("Car Started")
    }

    override fun stop() {
// Code to stop a Car
        println("Car Stopped")
    }

    override fun sound() {
// Code sound of a Car
        println("Brum...brum...brummmmm!")
    }
}
class Motorcycle(name: String,
    color: String,
    weight: Double,
    override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
//        start
        println("Bike Started")
    }

    override fun stop() {
// stop
        println("Bike Stopped")
    }

    override fun sound() {
//sound
        println("Preng...preng...prengggg!")

    }
}

fun main() {
    val car = Car("Ferrari 812 Superfast", "Red", 1525.0, 339.0)
    val motorCycle = Motorcycle("Ducati 1098s", "Red", 173.0, 271.0)

    car.displayDetails()
    motorCycle.displayDetails()

    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}

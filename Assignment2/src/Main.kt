fun main() {

    // implementing Vehicle class
    var regularCar = Vehicle("red", "Honda", "Civic")
    regularCar.accelerate()
    regularCar.stop()

    // implementing Car class... this is a car that actually exists
    var differentCar = Car("orange", "Hyundai", "Veloster", 3)
    differentCar.accelerate()
    differentCar.stop()
    differentCar.parallelPark()

    // implementing Bus class
    var cityBus = Bus("red and white", "New Flyer", "LFS Hybrid", 51)
    cityBus.accelerate()
    cityBus.stop()
    cityBus.openRearDoor()
}

// creating vehicle class
open class Vehicle(val color: String, val make: String, val model: String) {
    // adding accelerate and stop methods
    open fun accelerate() {
        println("The $color $make $model is now moving.")
    }
    open fun stop() {
        println("The $color $make $model has stopped.")
    }
}

// creating Car class that inherits from Vehicle
open class Car(color: String, make: String, model: String, val numberOfDoors: Int)
    : Vehicle(color, make, model) {
        override fun accelerate() {
            println("The $color $numberOfDoors door $make $model is now moving.")
        }
        override fun stop() {
            println("The $color $numberOfDoors door $make $model has stopped.")
        }
        fun parallelPark() {
            println("The $color $numberOfDoors door $make $model is attempting to parallel park.")
        }
    }

// creating Bus class that inherits from Vehicle
open class Bus(color: String, make: String, model: String, val passengerCapacity: Int)
    : Vehicle(color,make, model) {
        override fun accelerate() {
            println("The $color $make $model has left the bus stop with it's full compliment of $passengerCapacity passengers.")
        }
        override fun stop() {
            println("The $color $make $model has stopped the bus stop with it's full compliment of $passengerCapacity passengers.")
        }
        fun openRearDoor() {
            println("The $color $make $model has now opened it's rear door to let off all $passengerCapacity passengers because the bus is now out of service.")
        }
    }
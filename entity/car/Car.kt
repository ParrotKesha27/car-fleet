package fleet.entity.car

import fleet.entity.engine.Engine
import fleet.entity.person.Driver


open class Car(
    val brand: String,
    val transmissionType: Transmission,
    val weight: Float,
    val driver: Driver,
    val engine: Engine
) {
    open fun action() {
        start()
    }

    fun start() {
        println("Let's go!")
    }

    fun stop() {
        println("Stop...")
    }

    fun turnRight() {
        println("Turn right ->")
    }

    fun turnLeft() {
        println("Turn left <-")
    }

    override fun toString() = "Brand: $brand\nTransmission: $transmissionType\nWeight: $weight\nDriver: $driver\nEngine: $engine"
}

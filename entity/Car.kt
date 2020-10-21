package test.entity.car

import test.entity.driver.Driver
import test.entity.engine.Engine


class Lorry(
    brand: String,
    type: String,
    weight: Float,
    driver: Driver,
    engine: Engine,
    val capacity: Float
) : Car(brand, type, weight, driver, engine) {
    override fun toString(): String{
        return "Brand: $brand\nType: $type\nWeight: $weight\nDriver: $driver\nEngine: $engine\nCapacity: $capacity"
    }
}


class SportCar(
    brand: String,
    type: String,
    weight: Float,
    driver: Driver,
    engine: Engine,
    val maxSpeed: Int
) : Car(brand, type, weight, driver, engine) {
    override fun toString(): String {
        return "Brand: $brand\nType: $type\nWeight: $weight\nDriver: $driver\nEngine: $engine\nMax speed: $maxSpeed"
    }
}


open class Car(
    val brand: String,
    val type: String,
    val weight: Float,
    val driver: Driver,
    val engine: Engine
) {
    fun start() {
        println("Поехали!")
    }

    fun stop() {
        println("Останавливаемся...")
    }

    fun turnRight() {
        println("Поворот направо")
    }

    fun turnLeft() {
        println("Поворот налево")
    }

    fun printInfo() {
        println(this.toString())
    }

    override fun toString() = "Brand: $brand\nType: $type\nWeight: $weight\nDriver: $driver\nEngine: $engine"
}

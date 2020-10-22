package fleet.entity.car

import fleet.entity.engine.Engine
import fleet.entity.person.Driver


class SportCar(
    brand: String,
    transmissionType: Transmission,
    weight: Float,
    driver: Driver,
    engine: Engine,
    val maxSpeed: Int
) : Car(brand, transmissionType, weight, driver, engine) {
    override fun action() {
        super.action()
        turnLeft()
    }

    override fun toString() = super.toString() + "\nMax speed: $maxSpeed"
}

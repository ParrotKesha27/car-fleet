package fleet.entity.car

import fleet.entity.engine.Engine
import fleet.entity.person.Driver


class Lorry(
    brand: String,
    transmissionType: Transmission,
    weight: Float,
    driver: Driver,
    engine: Engine,
    val liftingCapacity: Float
) : Car(brand, transmissionType, weight, driver, engine) {
    override fun action() {
        super.action()
        turnRight()
    }

    override fun toString() = "${super.toString()}\nLifting capacity: $liftingCapacity"
}

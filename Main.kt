package fleet

import java.time.LocalDate
import java.time.Period
import kotlin.random.Random
import fleet.entity.car.*
import fleet.entity.engine.Engine
import fleet.entity.person.Driver


fun main() {
    var carFleet = initCarFleet(10)

    for (car in carFleet) {
        car.action()
    }
}

fun initCarFleet(count: Int) = mutableListOf<Car>().apply {
    (1..count).map {
        this.add(createCarByNumber(it))
    }
}

fun createCarByNumber(number: Int): Car {
    var experience = Period.of((0..10).random(), (1..11).random(), (1..30).random())
    var driver = Driver("Driver $number", experience)

    var power = (200..500).random()
    var weight = (1000..2000).random().toFloat()
    var engine = Engine(power, "Vendor $number")
    var transmission = if (number % 2 == 0) Transmission.AUTOMATIC else Transmission.MANUAL

    return when {
        number % 3 == 0 -> Car("Car $number", transmission, weight, driver, engine)
        number % 3 == 1 -> Lorry("Car $number", transmission, weight, driver, engine, (3000..5000).random().toFloat())
        else -> SportCar("Car $number", transmission, weight, driver, engine, (300..450).random())
    }
}

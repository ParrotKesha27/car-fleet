package test

import java.time.LocalDate
import java.time.Period
import test.entity.car.Car
import test.entity.car.Lorry
import test.entity.car.SportCar
import test.entity.engine.Engine
import test.entity.driver.Driver


fun main(args: Array<String>) {
    var carPark: ArrayList<Car> = initCarPark(10)

    for (car in carPark) {
        if (car is SportCar) {
            car.start()
            car.turnLeft()
        }
        if (car is Lorry) {
            car.start()
            car.turnRight()
        }
    }
}

fun initCarPark(count: Int): ArrayList<Car> {
    var carPark: ArrayList<Car> = ArrayList<Car>()
    
    for (i in 0..count) {
        var dateStart = LocalDate.parse("2019-06-25")
        var dateEnd = LocalDate.parse("2020-03-17")
        var experience = Period.between(dateStart, dateEnd)
        var driver = Driver("Driver $i", experience)
        var engine = Engine((i + 1) * 74, "Engine $i")
        var car = when {
            i % 3 == 0 -> Car("Car $i", "Sedan", 1400.0F, driver, engine)
            i % 3 == 1 -> Lorry("Car $i", "Tractor", 3700.0F, driver, engine, 4000.0F)
            else -> SportCar("Car $i", "Sportcar", 800.0F, driver, engine, 350)
        }
        carPark.add(car)
    }

    return carPark
}

package test.entity.driver

import java.time.Period


class Driver(fullName: String, _experience: Period) : Person(fullName) {
    var experience: Period
    init {
        experience = _experience
    }

    override fun toString(): String = "Full name: $fullName; Experience: ${experience.toDetailString()}"
}

open class Person(val fullName: String) {
    override fun toString(): String = "Full name: $fullName"
}

fun Period.toDetailString(): String {
    return "${this.getYears()} years, ${this.getMonths()} months, ${this.getDays()} days" 
}

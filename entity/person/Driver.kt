package fleet.entity.person

import java.time.Period
import fleet.extension.toDetailString


class Driver(fullName: String, val experience: Period) : Person(fullName) {
    override fun toString() = "${super.toString()}; Experience: ${experience.toDetailString()}"
}

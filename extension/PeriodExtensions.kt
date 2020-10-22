package fleet.extension

import java.time.Period


fun Period.toDetailString() = "${this.getYears()} years, ${this.getMonths()} months, ${this.getDays()} days"

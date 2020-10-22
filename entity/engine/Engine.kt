package fleet.entity.engine


class Engine(val power: Int, val vendor: String) {
    override fun toString() = "Power: $power; Vendor $vendor"
}

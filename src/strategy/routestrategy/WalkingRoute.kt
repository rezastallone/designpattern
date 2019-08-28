package strategy.routestrategy

class WalkingRoute: RouteStrategy {
    override fun displayRoute(start: Long, end: Long) {
        println("Showing walking route from $start to $end")
    }
}
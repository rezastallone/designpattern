package strategy.routestrategy

class BusRoute: RouteStrategy {
    override fun displayRoute(start: Long, end: Long) {
        println("Showing bus route from $start to $end")
    }
}
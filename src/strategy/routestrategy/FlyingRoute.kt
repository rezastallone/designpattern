package strategy.routestrategy

class FlyingRoute: RouteStrategy{
    override fun displayRoute(start: Long, end: Long) {
        println("Showing flying route from $start to $end")
    }
}
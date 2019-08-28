package strategy

import strategy.routestrategy.BusRoute
import strategy.routestrategy.FlyingRoute
import strategy.routestrategy.WalkingRoute
import strategy.texturestrategy.EarthTexture
import strategy.texturestrategy.RoadTexture
import strategy.texturestrategy.TopographyTexture

fun main() {
    val walkRoute = WalkingRoute()
    val busRoute = BusRoute()
    val flyRoute = FlyingRoute()

    val earthTexture = EarthTexture()
    val topographyTexture = TopographyTexture()
    val roadTexture = RoadTexture()

    val googleMap = GoogleMap(walkRoute, earthTexture)
    googleMap.displayMap()
    googleMap.displayRoute(20,10)

    googleMap.route = flyRoute
    googleMap.mapTexture = roadTexture

    googleMap.displayMap()
    googleMap.displayRoute(20,10)

    val appleMap = AppleMap(busRoute, topographyTexture)
    appleMap.displayMap()
    appleMap.displayRoute(30,60)

    appleMap.route = walkRoute
    appleMap.mapTexture = earthTexture

    appleMap.displayMap()
    appleMap.displayRoute(30,60)
}
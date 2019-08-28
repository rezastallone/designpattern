package strategy

import strategy.texturestrategy.TextureStrategy
import strategy.routestrategy.RouteStrategy

abstract class Map(var mapTexture: TextureStrategy,var route: RouteStrategy) {
    abstract fun displayMap()
    abstract fun displayRoute(start: Long, end: Long)
}
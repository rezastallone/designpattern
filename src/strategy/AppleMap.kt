package strategy

import strategy.routestrategy.RouteStrategy
import strategy.texturestrategy.TextureStrategy

class AppleMap(route: RouteStrategy, texture: TextureStrategy) : Map(texture,route){
    override fun displayMap() {
        println("Using AppleMap")
        mapTexture.displayTextureMap()
    }

    override fun displayRoute(start: Long, end: Long) {
        println("Using AppleMap")
        route.displayRoute(start, end)
    }
}
package strategy

import strategy.routestrategy.RouteStrategy
import strategy.texturestrategy.TextureStrategy

class GoogleMap(route: RouteStrategy, texture: TextureStrategy) : Map(texture,route){
    override fun displayMap() {
        println("This is GoogleMap")
        mapTexture.displayTextureMap()
    }

    override fun displayRoute(start: Long, end: Long) {
        println("This is GoogleMap")
        route.displayRoute(start,end)
    }
}
package factory

interface MartabakStore{
    fun orderPizza(type: MartabakType): Martabak
}
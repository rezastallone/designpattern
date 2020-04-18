package factory.store

import factory.Martabak
import factory.MartabakStore
import factory.MartabakType

abstract class BaseMartabakStore(): MartabakStore {

    override fun orderPizza(type: MartabakType): Martabak {
        val martabak: Martabak = getMartabak(type)
        bakeMartabak(martabak)
        packageMartabak(martabak)
        return martabak
    }

    private fun packageMartabak(martabak: Martabak) {
        println("Packaging $martabak")
    }

    private fun bakeMartabak(martabak: Martabak) {
        println("Baking $martabak ... ")
    }

    abstract fun getMartabak(type: MartabakType): Martabak
}
package factory.martabak

import factory.Martabak
import factory.MartabakIngridientFactory

class MartabakCoklat(private val martabakIngridientFactory: MartabakIngridientFactory): Martabak{

    private lateinit var adonan: String

    private lateinit var crust: String

    private lateinit var coklat: String

    override fun prepare() {
        adonan = martabakIngridientFactory.provideAdonan()
        crust = martabakIngridientFactory.provideCrust()
        coklat = "Coklat"
    }

    override fun toString(): String {
        return "$adonan $crust $coklat"
    }
}
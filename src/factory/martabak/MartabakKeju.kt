package factory.martabak

import factory.Martabak
import factory.MartabakIngridientFactory

class MartabakKeju(private val martabakIngridientFactory: MartabakIngridientFactory): Martabak{

    private lateinit var adonan: String

    private lateinit var crust: String

    private lateinit var keju: String

    override fun prepare() {
        adonan = martabakIngridientFactory.provideAdonan()
        crust = martabakIngridientFactory.provideCrust()
        keju = "Keju"
    }

    override fun toString(): String {
        return "$adonan $crust $keju"
    }
}
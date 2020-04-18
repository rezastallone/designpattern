package factory.ingridient

import factory.MartabakIngridientFactory

class SanfransiscoStyleIngridient: MartabakIngridientFactory {
    override fun provideAdonan(): String {
        return "Sanfransisco Adonan"
    }

    override fun provideCrust(): String {
        return "Sanfransisco Crust"
    }
}
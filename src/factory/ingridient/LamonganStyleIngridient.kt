package factory.ingridient

import factory.MartabakIngridientFactory

class LamonganStyleIngridient: MartabakIngridientFactory {
    override fun provideAdonan(): String {
        return "Lamongan Adonan"
    }

    override fun provideCrust(): String {
        return "Lamongan Crust"
    }

}
package factory.ingridient

import factory.MartabakIngridientFactory

class BangkaStyleIngridient() : MartabakIngridientFactory {
    override fun provideAdonan(): String {
        return "Adonan Bangka"
    }

    override fun provideCrust(): String {
        return "Bangka crust"
    }

}
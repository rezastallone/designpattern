package factory

interface MartabakIngridientFactory{
    fun provideAdonan(): String
    fun provideCrust(): String
}
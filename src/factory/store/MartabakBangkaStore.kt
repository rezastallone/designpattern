package factory.store

import factory.Martabak
import factory.MartabakType
import factory.MartabakType.*
import factory.ingridient.BangkaStyleIngridient
import factory.martabak.MartabakCoklat
import factory.martabak.MartabakKeju

class MartabakBangkaStore() : BaseMartabakStore(){
    override fun getMartabak(type: MartabakType): Martabak {
        val martabakIngridientFactory = BangkaStyleIngridient()
        return when(type){
            CHEESE -> MartabakCoklat(martabakIngridientFactory)
            CHOCOLATE -> MartabakKeju(martabakIngridientFactory)
        }.apply {
            prepare()
        }
    }
}
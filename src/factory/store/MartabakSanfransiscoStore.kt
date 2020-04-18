package factory.store

import factory.Martabak
import factory.MartabakStore
import factory.MartabakType
import factory.ingridient.LamonganStyleIngridient
import factory.ingridient.SanfransiscoStyleIngridient
import factory.martabak.MartabakCoklat
import factory.martabak.MartabakKeju

class MartabakSanfransiscoStore: MartabakStore {

    override fun orderPizza(type: MartabakType): Martabak {
        val martabakIngridientFactory = SanfransiscoStyleIngridient()
        return when(type){
            MartabakType.CHEESE -> MartabakCoklat(martabakIngridientFactory)
            MartabakType.CHOCOLATE -> MartabakKeju(martabakIngridientFactory)
        }.apply {
            prepare()
        }
    }

}
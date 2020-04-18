package factory.store

import factory.Martabak
import factory.MartabakStore
import factory.MartabakType
import factory.MartabakType.*
import factory.ingridient.BangkaStyleIngridient
import factory.ingridient.LamonganStyleIngridient
import factory.martabak.MartabakCoklat
import factory.martabak.MartabakKeju

class MartabakLamonganStore: MartabakStore{

    override fun orderPizza(type: MartabakType): Martabak {
        val martabakIngridientFactory = LamonganStyleIngridient()
        return when(type){
            CHEESE -> MartabakCoklat(martabakIngridientFactory)
            CHOCOLATE -> MartabakKeju(martabakIngridientFactory)
        }.apply {
            prepare()
        }
    }

}
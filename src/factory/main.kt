package factory

import factory.store.MartabakBangkaStore
import factory.store.MartabakLamonganStore
import factory.store.MartabakSanfransiscoStore

fun main() {
    val lamonganStore = MartabakLamonganStore()
    println(lamonganStore.orderPizza(MartabakType.CHOCOLATE))
    println(lamonganStore.orderPizza(MartabakType.CHEESE))

    val sanfransiscoStore = MartabakSanfransiscoStore()
    println(sanfransiscoStore.orderPizza(MartabakType.CHOCOLATE))
    println(sanfransiscoStore.orderPizza(MartabakType.CHEESE))

    val bangkaStore = MartabakBangkaStore()
    println(bangkaStore.orderPizza(MartabakType.CHOCOLATE))
    println(bangkaStore.orderPizza(MartabakType.CHEESE))
}
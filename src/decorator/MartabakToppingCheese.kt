package decorator

class MartabakToppingCheese(override val martabakProp: Martabak): Martabak{

    private val desc = " Cheese Topping,"

    override fun getDescription() = martabakProp.getDescription() + desc

    override fun getCost() = martabakProp.getCost() + 10000f

    override fun getTopping(): String {
        return martabakProp.getTopping() + desc
    }
}
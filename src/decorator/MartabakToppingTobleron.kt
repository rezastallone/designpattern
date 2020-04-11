package decorator

class MartabakToppingTobleron(override val martabakProp: Martabak): Martabak{
    private val desc = " Tobleron Topping,"

    override fun getDescription(): String {
        return super.getDescription() + desc
    }

    override fun getCost(): Float {
        return super.getCost() + 12000
    }

    override fun getTopping(): String {
        return super.getTopping() + desc
    }
}
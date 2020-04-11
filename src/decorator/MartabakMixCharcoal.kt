package decorator

class MartabakMixCharcoal(override val martabakProp: Martabak): Martabak{

    private val desc = " Charcoal Mix,"

    override fun getDescription(): String {
        return martabakProp.getDescription() + desc
    }

    override fun getCost(): Float {
        return martabakProp.getCost() + 5000
    }

    override fun getMixture(): String {
        return martabakProp.getMixture() + desc
    }
}
package decorator

class MartabakCrustCrispy(override val martabakProp: Martabak): Martabak{

    private val desc = " Crispy Crust,"

    override fun getDescription(): String {
        return martabakProp.getDescription() + desc
    }

    override fun getCost(): Float {
        return martabakProp.getCost() + 4000
    }

    override fun getCrust(): String {
        return super.getCrust() + desc
    }
}
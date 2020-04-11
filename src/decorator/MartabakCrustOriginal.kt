package decorator

class MartabakCrustOriginal(override val martabakProp: Martabak): Martabak{
    private val desc = " Original Crust,"

    override fun getDescription(): String {
        return super.getDescription() + desc
    }

    override fun getCost(): Float {
        return super.getCost() + 2000
    }

    override fun getCrust(): String {
        return super.getCrust() + desc
    }
}
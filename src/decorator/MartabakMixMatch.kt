package decorator

class MartabakMixMatch(override val martabakProp: Martabak): Martabak{

    override fun getDescription(): String {
        return super.getDescription() + desc
    }

    override fun getCost(): Float {
        return super.getCost() + 4500
    }

    override fun getMixture(): String {
        return super.getMixture() + desc
    }

    companion object {
        private const val desc = " Match Mix,"
    }
}
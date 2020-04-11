package decorator

class MartabakCheeseTobleronCharcoalMix(): Martabak{

    override val martabakProp: Martabak
        get() = this

    override fun getDescription(): String {
        return ""
    }

    override fun getCost(): Float {
        return 5000f
    }

    override fun getCrust(): String {
        return ""
    }

    override fun getMixture(): String {
        return ""
    }

    override fun getTopping(): String {
        return ""
    }
}
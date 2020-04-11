package decorator

class MartabakTobleronCrispyMatchaMix(): Martabak{

    override val martabakProp: Martabak
        get() = this

    override fun getDescription(): String {
        return ""
    }

    override fun getCost(): Float {
        return 3000f
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
package decorator

interface Martabak{
    val martabakProp: Martabak
    fun getDescription(): String {
        return martabakProp.getDescription()
    }
    fun getCost(): Float {
        return martabakProp.getCost()
    }
    fun getTopping(): String {
        return martabakProp.getTopping()
    }
    fun getMixture(): String{
        return martabakProp.getMixture()
    }
    fun getCrust(): String{
        return martabakProp.getCrust()
    }
}
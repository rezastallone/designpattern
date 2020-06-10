package iteratorcomposite

interface Bee{
    fun flyLeft()
    fun flyRight()
    fun flyDown()
    fun flyUp()
    fun isQueen(): Boolean
    fun createIterator(): Iterator<Bee>
    fun addChild(bee: Bee)
}
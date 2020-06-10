package iteratorcomposite

class BeeQueen: BeeComponent(){

    private val beeSoldiers = ArrayList<Bee>()

    override fun flyLeft() {
        println("Queen fly left")
    }

    override fun flyRight() {
        println("Queen fly right")
    }

    override fun flyDown() {
        println("Queen fly down")
    }

    override fun flyUp() {
        println("Queen fly up")
    }

    override fun addChild(bee: Bee) {
        beeSoldiers.add(bee)
    }

    override fun isQueen(): Boolean {
        return true
    }

    override fun createIterator(): Iterator<Bee> {
        return CompositeIterators(beeSoldiers.iterator())
    }
}
package iteratorcomposite

abstract class BeeComponent: Bee {

    override fun isQueen(): Boolean{
        return false
    }

    override fun createIterator(): Iterator<Bee>{
        return NullIterator()
    }

    override fun addChild(bee: Bee){

    }
}

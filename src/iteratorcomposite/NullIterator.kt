package iteratorcomposite

class NullIterator: Iterator<Bee>{
    override fun hasNext(): Boolean {
        return false
    }

    override fun next(): Bee {
        return NullBee()
    }

}
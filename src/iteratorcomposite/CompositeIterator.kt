package iteratorcomposite

import java.util.*

class CompositeIterators(iterator: MutableIterator<Bee>) : Iterator<Bee> {

    private val stack = Stack<Iterator<Bee>>()

    init {
        stack.add(iterator)
    }

    override fun hasNext(): Boolean {
        if (stack.isEmpty()){
            return false
        } else {
            val iterator = stack.peek()
            if (!iterator.hasNext()){
                stack.pop()
                return hasNext()
            }
            return true
        }
    }

    override fun next(): Bee {
        if (hasNext()){
            val iterator =  stack.peek()
            val component = iterator.next()
            if (component is BeeQueen){
                stack.push(component.createIterator())
            }
            return component
        }
        return NullBee()
    }
}

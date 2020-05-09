package adapter

class KeyboardController: Keyboard{
    override fun wKey() {
        println("Move forward")
    }

    override fun sKey() {
        println("Move backward")
    }

    override fun aKey() {
        println("Move leftward")
    }

    override fun dKey() {
        println("Move rightward")
    }

}
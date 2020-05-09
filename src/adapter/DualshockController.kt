package adapter

class DualshockController: Dualshock{
    override fun analogUp() {
        println("Move forward")
    }

    override fun analogDown() {
        println("Move backward")
    }

    override fun analogLeft() {
        println("Move leftward")
    }

    override fun analogRight() {
        println("Move rightward")
    }

}
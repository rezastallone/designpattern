package adapter

class KeyboardDualshockConverter(private val keyboard: Keyboard): Dualshock{
    override fun analogUp() {
        keyboard.wKey()
    }

    override fun analogDown() {
        keyboard.sKey()
    }

    override fun analogLeft() {
        keyboard.aKey()
    }

    override fun analogRight() {
        keyboard.dKey()
    }

}
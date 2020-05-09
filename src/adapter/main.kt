package adapter

fun main() {
    val dualshockController: Dualshock = DualshockController()

    val keyboardController: Keyboard = KeyboardController()

    val converter = KeyboardDualshockConverter(keyboardController)

    val playstation = Playstation(dualshockController)
    playstation.play()

    playstation.controller = converter
    playstation.play()
}
package state

class SmartPhone {

    val changeState : (SmartphoneButtonState) -> Unit = {
        buttonStateState = it
    }

    var turnedOffButtonState = TurnedOffButtonState(this)

    var standbyButtonState = StandbyButtonState(this)

    var buttonStateState: SmartphoneButtonState = turnedOffButtonState

    fun volumeUp() {
        buttonStateState.volumeUp()
    }

    fun volumeDown() {
        buttonStateState.volumeDown()
    }

    fun powerButton() {
        buttonStateState.powerButton()
    }
}
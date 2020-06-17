package state

class TurnedOffButtonState(val smartPhone: SmartPhone) : SmartphoneButtonState{

    override fun volumeUp() {
        println("No action while turned off")
    }

    override fun volumeDown() {
        println("No action while turned off")
    }

    override fun powerButton() {
        println("Turning on phone")
        smartPhone.changeState(smartPhone.standbyButtonState)
    }

}
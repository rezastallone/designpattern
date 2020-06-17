package state

class StandbyButtonState(val smartPhone: SmartPhone) : SmartphoneButtonState{

    override fun volumeUp() {
        println("Volume up")
    }

    override fun volumeDown() {
        println("Volume down")
    }

    override fun powerButton() {
        println("Turning off phone")
        smartPhone.changeState(smartPhone.turnedOffButtonState)
    }

}
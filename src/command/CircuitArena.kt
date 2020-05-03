package command

fun main() {
    val gasCommand = GasCommand()

    val reverseCommand = ReverseCommand()

    val turnLeftCommand = TurnLeftCommand()

    val turnRightCommand = TurnRightCommand()

    val donutMacroCommand = DonutMacroCommand()

    val sMacroCommand = SMacroCommand()

    val remoteControlCar = RemoteControlCar().apply {
        setCommand(0, gasCommand)
        setCommand(1, reverseCommand)
        setCommand(2, turnLeftCommand)
        setCommand(3, turnRightCommand)
        setCommand(4, donutMacroCommand)
        setCommand(5, sMacroCommand)
    }

    remoteControlCar.run {
        execute(0)
        execute(1)
        execute(2)
        execute(3)
        execute(4)
        execute(5)
    }
}
package command

class SMacroCommand: Command{

    private val turnLeftCommand: Command = TurnLeftCommand()

    private val turnRightCommand: Command = TurnRightCommand()

    private val gasCommand: Command = GasCommand()

    override fun execute() {
        gasCommand.execute()
        turnLeftCommand.execute()
        turnLeftCommand.execute()
        gasCommand.execute()
        turnRightCommand.execute()
        turnRightCommand.execute()
        gasCommand.execute()
    }

    override fun undo() {
        gasCommand.undo()
        turnRightCommand.undo()
        turnRightCommand.undo()
        gasCommand.undo()
        turnLeftCommand.undo()
        turnLeftCommand.undo()
        gasCommand.undo()
    }
}
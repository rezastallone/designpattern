package command

class DonutMacroCommand: Command{
    private val turnLeftCommand: Command = TurnLeftCommand()
    override fun execute() {
        repeat(8){
            turnLeftCommand.execute()
        }
    }

    override fun undo() {
        repeat(8){
            turnLeftCommand.undo()
        }
    }
}
package command

class TurnRightCommand: Command{
    override fun execute() {
        println("Turn right 45 degree")
    }

    override fun undo() {
        println("Turn left 45 degree")
    }
}
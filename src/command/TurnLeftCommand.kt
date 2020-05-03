package command

class TurnLeftCommand: Command{
    override fun execute() {
        println("Turn left 45 degree")
    }

    override fun undo() {
        println("Turn right 45 degree")
    }
}
package command

class ReverseCommand: Command{
    override fun execute() {
        println("Move backward 10 meters")
    }

    override fun undo() {
        println("move forward 10 meters")
    }
}
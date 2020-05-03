package command

class GasCommand: Command{

    override fun execute() {
        println("Move forward 10 meters")
    }

    override fun undo() {
        println("Move backward 10 meters")
    }
}
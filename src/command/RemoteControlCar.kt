package command

class RemoteControlCar{

    private val commands: MutableList<Command> = mutableListOf()

    private val undocommand: MutableList<Command> = mutableListOf()

    init {
        repeat(10){
            commands.add(NoCommand())
            undocommand.add(NoCommand())
        }
    }

    fun setCommand(position: Int, command: Command){
        commands[position] = command
    }

    fun execute(position: Int){
        commands.getOrNull(position)?.let {
            it.execute()
            undocommand[position] = it
        } ?: println("Command not found in position $position")
    }
}
package adapter

class Playstation(var controller: Dualshock){

    fun play(){
        controller.run {
            analogUp()
            analogRight()
            analogUp()
            analogRight()
            analogUp()
            analogDown()
            analogLeft()
            analogDown()
            analogRight()
            analogDown()
            analogLeft()
        }
    }
}
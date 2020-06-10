package iteratorcomposite

class BeeSoldier: BeeComponent(){

    override fun flyLeft() {
        println("Soldier fly left")
    }

    override fun flyRight() {
        println("Soldier fly right")
    }

    override fun flyDown() {
        println("Soldier fly down")
    }

    override fun flyUp() {
        println("Soldier fly up")
    }
}
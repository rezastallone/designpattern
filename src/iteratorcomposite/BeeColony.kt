package iteratorcomposite

class BeeColony(private val beeQueen: BeeQueen): BeeComponent(){

    override fun flyLeft() {
        doAll {
            it.flyLeft()
        }
    }

    override fun flyRight() {
        doAll {
            it.flyRight()
        }
    }

    override fun flyDown() {
        doAll {
            it.flyDown()
        }
    }

    override fun flyUp() {
        doAll {
            it.flyUp()
        }
    }

    private fun doAll(action: (Bee) -> Unit){
        beeQueen.createIterator().forEach(action)
    }

}
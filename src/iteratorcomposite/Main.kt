package iteratorcomposite

fun main() {
    val queen1 = BeeQueen()
    queen1.addChild(BeeSoldier())
    queen1.addChild(BeeSoldier())
    queen1.addChild(BeeSoldier())

    val queen2 = BeeQueen()
    queen2.addChild(BeeSoldier())
    queen2.addChild(BeeSoldier())
    queen1.addChild(queen2)

    val queen3 = BeeQueen()
    queen3.addChild(BeeSoldier())

    queen1.addChild(queen3)

    val colony = BeeColony(queen1)
    colony.flyUp()
}
package decorator

fun main() {
    var martabakCheeseTobleronCharcoalMix: Martabak = MartabakCheeseTobleronCharcoalMix()
    martabakCheeseTobleronCharcoalMix = MartabakToppingCheese(martabakCheeseTobleronCharcoalMix)
    martabakCheeseTobleronCharcoalMix = MartabakToppingTobleron(martabakCheeseTobleronCharcoalMix)
    martabakCheeseTobleronCharcoalMix = MartabakMixCharcoal(martabakCheeseTobleronCharcoalMix)
    println(martabakCheeseTobleronCharcoalMix.getDescription())
    println("Cost : " + martabakCheeseTobleronCharcoalMix.getCost())

    var martabakTobleronCrispyMatchaMix: Martabak =  MartabakTobleronCrispyMatchaMix()
    martabakTobleronCrispyMatchaMix = MartabakToppingTobleron(martabakTobleronCrispyMatchaMix)
    martabakTobleronCrispyMatchaMix = MartabakCrustCrispy(martabakTobleronCrispyMatchaMix)
    martabakTobleronCrispyMatchaMix = MartabakMixMatch(martabakTobleronCrispyMatchaMix)
    println(martabakTobleronCrispyMatchaMix.getDescription())
    println("Cost : " + martabakTobleronCrispyMatchaMix.getCost())

}
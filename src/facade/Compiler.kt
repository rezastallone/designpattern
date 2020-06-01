package facade

interface Compiler{
    fun preprocessSourceCode()

    fun generateIntermediateCode()

    fun optimizeIntermediateCode()
}
package facade

class GCCCompiler(): Compiler{

    override fun preprocessSourceCode(){
        println("Preprocess source code, removing whitespaces & comment")
    }

    override fun generateIntermediateCode(){
        println("Generate intermediate code")
    }

    override fun optimizeIntermediateCode(){
        println("Optimize intermediate code")
    }
}
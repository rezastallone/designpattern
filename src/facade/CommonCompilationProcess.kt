package facade

class CommonCompilationProcess(
    private val assembler: Assembler,
    private val parseTree: ParseTree,
    private val symbolTable: SymbolTable,
    private val grammar: Grammar,
    private val gccCompiler: GCCCompiler
): CompilationProcess {

    private fun preprocessSourceCode(){
        gccCompiler.preprocessSourceCode()
    }

    private fun analyzeLexical() {
        println("Lexical analysis to convert for token")
        symbolTable.analyzeLexical()
        parseTree.generate()
    }

    private fun analyzeSyntax(){
        println("Syntax analysis to check for syntax error")
        symbolTable.analyzeSyntax()
        grammar.analyzeSyntax()
    }

    private fun analyzeSemantic(){
        println("Semantic analysis to check for meaningless semantic token")
        symbolTable.analyzeSemantic()
        grammar.analyzeSemantic()
    }

    private fun generateIntermediateCode(){
        gccCompiler.generateIntermediateCode()
    }

    private fun optimizeIntermediateCode(){
        gccCompiler.optimizeIntermediateCode()
    }

    private fun generateMachineCode(){
        assembler.generateMachineCode()
    }

    override fun run() {
        preprocessSourceCode()
        analyzeLexical()
        analyzeSyntax()
        analyzeSemantic()
        generateIntermediateCode()
        optimizeIntermediateCode()
        generateMachineCode()
        optimizeIntermediateCode()
    }
}
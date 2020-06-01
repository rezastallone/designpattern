package facade

fun main() {
    val commonCompilationProcess : CompilationProcess = CommonCompilationProcess(
        Assembler(),
        ParseTree(),
        SymbolTable(),
        Grammar(),
        GCCCompiler()
    )

    commonCompilationProcess.run()
}
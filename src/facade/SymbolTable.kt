package facade

class SymbolTable() {
    fun analyzeLexical() {
        println("Store token in symbol table")
    }

    fun analyzeSyntax() {
        println("Symbol table check for syntax error")
    }

    fun analyzeSemantic() {
        println("Semantic analysis to check for semantical error")
    }
}
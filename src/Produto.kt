open class Produto (open var preco : Double, var nome : String) {
    fun retornoPreco():Double {
        return preco


    }

    override fun toString(): String {
        return "Produto(preco=$preco, nome='$nome')"
    }
}
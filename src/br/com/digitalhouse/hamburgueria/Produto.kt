package br.com.digitalhouse.hamburgueria

open class Produto (open var preco : Double, var nome : String) {
    fun retornoPreco():Double {
        return preco
    }

    override fun toString(): String {
        return "br.com.digitalhouse.hamburgueria.Produto(preco=$preco, nome='$nome')"
    }
}
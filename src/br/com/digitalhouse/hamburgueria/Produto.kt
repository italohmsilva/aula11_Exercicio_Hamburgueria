package br.com.digitalhouse.hamburgueria

open class Produto (open var preco : Double, var nome : String) {
    override fun toString(): String {
        return "Nome: $nome preço:$preco"
    }
}
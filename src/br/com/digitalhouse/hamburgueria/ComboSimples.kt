package br.com.digitalhouse.hamburgueria

class ComboSimples(var nome : String, vararg listProdutosCombo: Produto) {
    var precoCombo = listProdutosCombo.sumByDouble{it.preco}
    var precoPromocional: Double = precoCombo*0.9
    //var listProdutosCombo = arrayListOf<Produto>()

    //fun addProdutosCombo(vararg produtos: Produto) {
      //  listProdutosCombo.addAll(produtos)
    //}

    fun retornoPreco():Double {
        return precoPromocional
    }

    override fun toString(): String {
        return "br.com.digitalhouse.hamburgueria.Produto(preco=$precoPromocional, nome='$nome')"
    }
}
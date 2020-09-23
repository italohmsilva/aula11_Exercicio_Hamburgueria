package br.com.digitalhouse.hamburgueria

class ComboFamiliar(var nome : String, vararg listCombos: ComboSimples) {

    //var precoComboFam = listCombos.forEach {precoComboFam += it.precoPromocional}

    var precoComboFam = listCombos.sumByDouble{it.precoPromocional}
    var precoPromoFam: Double = precoComboFam*0.8


    //var listCombos = arrayListOf<ComboSimples>()

    //fun addProdutosCombo(vararg produtos: Produto) = listCombos.addAll(produtos)

    fun retornoPreco():Double {
        return precoPromoFam
    }

    override fun toString(): String {
        return "br.com.digitalhouse.hamburgueria.Produto(preco=$precoPromoFam, nome='$nome')"
    }
}
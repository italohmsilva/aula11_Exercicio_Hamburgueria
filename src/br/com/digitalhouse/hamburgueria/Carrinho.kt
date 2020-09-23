package br.com.digitalhouse.hamburgueria

class Carrinho(){
    var listProduto = arrayListOf<Produto>()
    var listCombos = arrayListOf<ComboSimples>()
    var listComboFamiliar = arrayListOf<ComboFamiliar>()

    fun addProdutos(vararg produtos: Produto) {
        listProduto.addAll(produtos)
    }

    fun addCombos(vararg combos: ComboSimples) {
        listCombos.addAll(combos)
    }

    fun addComboFamiliar(vararg combosFam: ComboFamiliar) {
        listComboFamiliar.addAll(combosFam)
    }

    var precoCombos = 0.00
    var precoComboFamiliar = 0.00

    fun calcularPrecoCombo (listCombos: ArrayList<ComboSimples>): Double {
        listCombos.forEach {
            precoCombos =+ it.retornoPreco()}
        return precoCombos
    }

    fun calcularPrecoComboFamiliar (listComboFamiliar: ArrayList<ComboFamiliar>): Double  {
        listComboFamiliar.forEach {
            precoComboFamiliar =+ it.retornoPreco()}
        return precoComboFamiliar
    }

    var precoProdutos = listProduto.sumByDouble{it.preco}

    fun valorDaCompra() :Double{

        return precoProdutos + calcularPrecoCombo(listCombos) + calcularPrecoComboFamiliar(listComboFamiliar)

    }



}
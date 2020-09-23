package br.com.digitalhouse.hamburgueria

class Carrinho(){
    var listProduto = mutableListOf<Produto>()
    var listComboSimples = mutableListOf<ComboSimples>()
    var listComboFamiliar = mutableListOf<ComboFamiliar>()

    fun addProduto(vararg produto: Produto) = listProduto.addAll(produto)

    fun addComboSimples(vararg comboSimples: ComboSimples) =  listComboSimples.addAll(comboSimples)



    fun addComboFamiliar(vararg comboFamiliar: ComboFamiliar) = listComboFamiliar.addAll(comboFamiliar)

    fun calculaResultado():Double{
        return listProduto.sumByDouble { it.preco } + listComboFamiliar.sumByDouble { it.precoCombo } + listComboSimples.sumByDouble { it.precoCombo }
    }



}
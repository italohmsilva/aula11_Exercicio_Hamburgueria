package br.com.digitalhouse.hamburgueria

class ComboFamiliar(var nome:String,vararg listaComboSimples:ComboSimples) {

    var precoCombo = listaComboSimples.sumByDouble { it.precoCombo }

    //var precoPromocional:Double = 0.9


    override fun toString(): String {
        return "Nome $nome Preço = $precoCombo"
    }
}
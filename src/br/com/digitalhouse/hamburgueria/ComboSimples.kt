package br.com.digitalhouse.hamburgueria

class ComboSimples(var nome:String,vararg listaCombo:Produto) {
    var precoCombo = listaCombo.sumByDouble{it.preco*0.9}

    //var precoPromocional :Double = 0.9



    override fun toString(): String {
        return "Nome: $nome Preço = $precoCombo"
    }
}
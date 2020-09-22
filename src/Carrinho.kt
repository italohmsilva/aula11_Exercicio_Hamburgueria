class Carrinho(){
    var listProduto = arrayListOf<Produto>()

    fun addProduto(vararg produto: Produto ) = listProduto.addAll(produto)

    fun valorDaCompra(produto:Produto) :Double{
        return listProduto.sumByDouble{if (it is ComboSimples) it.precoPromocional else it.preco}
    }


}
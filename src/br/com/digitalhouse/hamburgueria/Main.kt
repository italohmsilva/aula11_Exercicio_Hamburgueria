package br.com.digitalhouse.hamburgueria

fun main() {

    val batataPequena = Produto(3.50, "Batata P")
    val batataGrande = Produto(5.50, "Batata G")
    val lanche = Produto(9.50, "Lanche")
    val lancheKids = Produto(7.50, "Lanche Kids")
    val lancheVeg = Produto(8.50, "Lanche Veg")
    val refrigerante = Produto(4.50, "Refrigerante")
    val suco = Produto(4.50, "Suco")

    val combo1 = ComboSimples("Combo Kids", batataPequena, lancheKids, suco)
    val combo2 = ComboSimples("Combo Simples", batataGrande, lanche, refrigerante)
    val combo3 = ComboSimples("Combo Veg", batataGrande, lancheVeg, suco)

    val comboFam1 = ComboFamiliar("Combo Família", combo1, combo2, combo3)

    val carrinho = Carrinho()

    carrinho.addProdutos(batataGrande, lanche)
    carrinho.addCombos(combo1)
    carrinho.addComboFamiliar(comboFam1)

    println("Valor do combo: R$" + combo1.retornoPreco())
    println("Valor do combo familiar: R$" + comboFam1.retornoPreco())
    println("Valor do produto: R$" + batataPequena.retornoPreco())
    println("Valor total da compra: R$" + carrinho.valorDaCompra())



}
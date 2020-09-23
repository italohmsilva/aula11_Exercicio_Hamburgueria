package br.com.digitalhouse.hamburgueria

fun main() {

    val batataPequena = Produto(3.50, "Batata P")
    val batataGrande = Produto(5.50, "Batata G")
    val lanche = Produto(9.50, "Lanche")
    val lancheKids = Produto(7.50, "Lanche Kids")
    val lancheVeg = Produto(8.50, "Lanche Veg")
    val refrigerante = Produto(4.50, "Refrigerante")
    val suco = Produto(4.50, "Suco")
    var coca = Produto(3.00,"Coca - Cola")

    val combo1 = ComboSimples("Combo Kids", batataPequena, lancheKids, suco)
    val combo2 = ComboSimples("Combo Simples", batataGrande, lanche, refrigerante)
    val combo3 = ComboSimples("Combo Veg", batataGrande, lancheVeg, suco)
    var combo4 = ComboSimples("Combo do dia",lanche,coca)

    val comboFam1 = ComboFamiliar("Combo Família", combo1,combo2)

    var carrinho = Carrinho()
    println("------Carrinho-----")
    carrinho.addProduto(lanche)
    carrinho.listProduto.forEach{ println(" - $it")}
    carrinho.addComboFamiliar(comboFam1)
    carrinho.listComboFamiliar.forEach{ println("- $it")}
    print("Total da compra: ")
    println( carrinho.calculaResultado())


}
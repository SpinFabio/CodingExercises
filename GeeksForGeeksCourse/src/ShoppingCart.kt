class ShoppingCart ( ){
    var numberOfItems:Int=0
    var total:Int=0
    var articleList= mutableListOf<String>()

    fun addArticle(name:String, quantity:Int, price:Int){
        articleList.add(name)
        numberOfItems=numberOfItems+quantity
        total=total+price*numberOfItems
        println(" numero di articoli $numberOfItems \n prezzo totale della spesa $total")
    }




}
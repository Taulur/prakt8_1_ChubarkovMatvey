fun main() {
    try {
        var optom : Int
        var goods = Goods()
        goods.Input(goods)
        goods.Discount(goods)
        println("От какого количества товаров начинается скидка 20%?")
        do {
            optom = readLine()!!.toInt()
        } while (optom <= 0)
        goods.Optom(goods,optom)
        goods.Output(goods)
        goods.Zarabotok(goods)
    }
    catch (e:Exception)
    {
        println("Данные введены неверно")
    }
}
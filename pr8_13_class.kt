class Goods {
    var name = "Unnamed"
    var unit = "Unnamed"
    var price = 0.0
    var type = "Unnamed"
    var quantity = 0

    fun Input(goods : Goods) {
        try {
            println("Введите название товара")
            goods.name = readln()

            do {
                println("Введите цену в рублях")
                goods.price = readln()!!.toDouble()
            } while (goods.price <= 0)
            println("Введите единицу измерения")
            goods.unit = readln()
            do {
                println("Введите тип товара (Продукт | Мебель | Инструмент) (На продукты скидка 20%)")
                goods.type = readln()
            } while (!(goods.type == "Продукт") && !(goods.type == "Мебель") && !(goods.type == "Инструмент"))
            do {
                println("Введите количество товаров")
                goods.quantity = readln()!!.toInt()
            } while (goods.quantity <= 0)
        } catch (e: Exception) {
            println("Данные введены неверно")
        }
    }
    fun Output(goods : Goods)
    {
        println("Название товара - ${goods.name}")
        println("Цена товара - ${goods.price} рублей")
        println("Единица измерения - ${goods.unit}")
        println("Тип товара - ${goods.type}")
        println("Количество товаров - ${goods.quantity}")
    }

    fun Zarabotok(goods: Goods)
    {
        var money = goods.price * goods.quantity
        if (money <= 0)
            println("Заработка нет")
        else
            println("Заработок с товаров составляет - ${money} рублей")
    }

    fun Discount(goods: Goods)
    {
        if (goods.type == "Продукт")
            goods.price = goods.price * 0.8
    }

    fun Optom(goods: Goods, optom : Int)
    {
        if (goods.quantity > optom)
            goods.price = goods.price * 0.8
    }
}
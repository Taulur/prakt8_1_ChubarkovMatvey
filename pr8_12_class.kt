class Cinema {
    var film = "Unnamed"
    var seans = "Unnamed"
    var cost = 0.0
    var zal = 0
    var zriteli = 0

    fun Input(cinema: Cinema) {
        try {
            println("Введите название фильма")
            cinema.film = readln()
            do {
                println("Введите текущий сеанс (Утренний | Дневной | Вечерный)")
                cinema.seans = readln()
            } while (!(cinema.seans == "Утренний") && !(cinema.seans == "Дневной") && !(cinema.seans == "Вечерний"))
            do {
                println("Введите стоимость билета")
                cinema.cost = readln()!!.toDouble()
            } while (cinema.cost <= 0)
            do {
                println("Введите количество залов")
                cinema.zal = readln()!!.toInt()
            } while (cinema.zal <= 0)
            do {
                println("Введите количество зрителей")
                cinema.zriteli = readln()!!.toInt()
            } while (cinema.zriteli <= 0)
        } catch (e: Exception) {
            println("Данные введены неверно")
        }
    }
    fun Output(cinema: Cinema)
    {
        println("Название фильма - ${cinema.film}")
        println("Текущий сеанс - ${cinema.seans}")
        println("Стоимость билета - ${cinema.cost} рублей")
        println("Количество залов - ${cinema.zal}")
        println("Количество зрителей - ${cinema.zriteli}")
    }

    fun Zarabotok(cinema: Cinema)
    {
        var money = cinema.cost * cinema.zriteli
        if (money <= 0)
            println("Заработка нет")
        else
            println("Заработок с одного сеанса составляет - ${money} рублей")
    }

    fun Mesta(cinema: Cinema, perzritel : Int)
    {
        var zals = cinema.zal / perzritel
        if (cinema.zal < zals)
            println("${cinema.zal} залов для ${cinema.zriteli} зрителей не хватит")
        else
            println("${cinema.zal} залов для ${cinema.zriteli} зрителей хватит")
    }

    fun Discount(cinema: Cinema)
    {
        if (cinema.seans == "Утренний")
            cinema.cost = cinema.cost * 0.8
    }
}




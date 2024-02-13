fun main() {
    try {
        var perzal : Int
    var cinema = Cinema()
    cinema.Input(cinema)
        cinema.Discount(cinema)
    println("Сколько зрителей на один зал?")
    do {
        perzal = readLine()!!.toInt()
    } while (perzal <= 0)
        cinema.Output(cinema)
        cinema.Zarabotok(cinema)
        cinema.Mesta(cinema, perzal)
    }
    catch (e:Exception)
    {
        println("Данные введены неверно")
    }
}
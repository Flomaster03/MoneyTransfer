fun main() {

    val amount = 5000_00

    val commissionDouble = if (amount > 35_00) amount * 0.75 / 100 else 35_00
    val commission = commissionDouble.toInt()
    val commissionRuble = commission / 100
    val commissionPenny = commission % 100

    println("Комиссия за перевод составляет  $commissionRuble рублей $commissionPenny копеек")

}
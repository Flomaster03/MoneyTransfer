fun main() {

    val amount = 5000_00

    val commissionDouble = amount * 0.75 / 100 
    val commission = if(commissionDouble > 35_00.0) commissionDouble.toInt() else 35_00
    val commissionRuble = commission / 100
    val commissionPenny = commission % 100

    println("Комиссия за перевод составляет  $commissionRuble рублей $commissionPenny копеек")

}

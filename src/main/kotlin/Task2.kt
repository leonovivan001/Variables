fun main () {

    var originalPrice: Double = 12000.0
    var saleSize: Double = 20.0
    var discountAmount = originalPrice * saleSize / 100
    var finalPrice = originalPrice - discountAmount

    println("Цена без скидки: $originalPrice")
    println("Цена со скидкой: $finalPrice (скидка $saleSize%)")

}
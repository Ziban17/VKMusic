fun main() {
    val amount = 100_000
    val discount = 100
    val discountStart = 1_000
    val discountHard = 10_000
    val discountForHard = amount * 0.05
    val discountPrice = if ((amount <= discountHard) && (amount >= discountStart)) amount - discount else
        if (amount > discountHard) amount - discountForHard else amount
    val isSub = true
    val discountForSub = discountPrice.toDouble() * 0.01
    val finalDiscountPrice = if (isSub) discountPrice.toDouble() - discountForSub else discountPrice
    println("Сумма с учётом скидки $finalDiscountPrice")
}
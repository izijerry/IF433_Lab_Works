package oop_00000114034_AdmiralAlFariziBahri_Week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> memulai checkout...")
    method.pay(amount)
}

fun Main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== testing checkout ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}
package oop_00000114034_AdmiralAlFariziBahri_Week06

class Gopay: PaymentMethod{
    override fun pay(amount: Double) {
        println("Processing Rp.$amount via gopay server")
    }
}

class CreditCard: PaymentMethod{
    override fun pay(amount: Double) {
        println("Contacting bank for Rp.$amount")
    }
}
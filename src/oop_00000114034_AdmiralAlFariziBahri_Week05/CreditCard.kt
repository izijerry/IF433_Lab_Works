package oop_00000114034_AdmiralAlFariziBahri_Week05

class CreditCard(accountName : String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit){
            usedAmount += amount
            println("transaksi sukses")
        }else if (usedAmount + amount > limit){
            println("transaksi ditolak")
        }
    }
}
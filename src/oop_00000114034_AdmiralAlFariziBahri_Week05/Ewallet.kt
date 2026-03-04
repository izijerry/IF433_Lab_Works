package oop_00000114034_AdmiralAlFariziBahri_Week05

class Ewallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount){
            balance -= amount
            println("sukses")
        }else{
            println("saldo tidak cukup.")
        }
    }

    fun topup(amount: Double){
        balance += amount
    }
}
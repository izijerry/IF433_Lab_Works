package oop_00000114034_AdmiralAlFariziBahri_Week05

fun main(){
    val ewallet = Ewallet("gavin", 100000.0)
    val kredit = CreditCard("gavin", 1000000.0, 5000.0)

    val paymentMethod: List<PaymentMethod> = listOf(ewallet, kredit)

    for (payment in paymentMethod) {
        payment.processPayment(75000.0)
        println("------------")
    }

}
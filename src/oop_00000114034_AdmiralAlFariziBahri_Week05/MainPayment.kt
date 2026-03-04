package oop_00000114034_AdmiralAlFariziBahri_Week05

fun main(){
    val ewallet = Ewallet("gavin", 50000.0)
    val kredit = CreditCard("gavin", 1000000.0, 5000.0)

    val paymentMethod: List<PaymentMethod> = listOf(ewallet, kredit)

    for (payment in paymentMethod) {
        payment.processPayment(75000.0)
        println("------------")

        when (payment) {
            is Ewallet -> {
                println("top up")
                payment.topup(50000.0)

                println("coba bayar lagi")
                payment.processPayment(75000.0)
            }


        }
    }

}
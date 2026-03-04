package oop_00000114034_AdmiralAlFariziBahri_Week05

abstract class PaymentMethod(val accountName : String){
    abstract fun processPayment(amount: Double)

}
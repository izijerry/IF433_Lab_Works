package oop_00000114034_AdmiralAlFariziBahri_week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n===TEST LET BLOCK===")
    val validOrder = Order(null,250000)

    val recipt = validOrder.totalPrice?.let {price ->
        val tax = price * 0.11
        "transaksi Valid. hargar: Rp$price, pajak: Rp$tax"
    } ?: "transaksi invalid: Harga belum di-set!"

    println(recipt)
}
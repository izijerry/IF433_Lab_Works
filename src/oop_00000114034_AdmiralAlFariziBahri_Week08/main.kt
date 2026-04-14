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


    println("\n===TEST SAFE CASTING===")
    val mixedData: Link<Any> = listoff(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "laptop",
        4500000.0
    )

    for (item in mixedData){
        val text = item as? String

        text?.let{
            println("ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "uknown string"
    println("hasil cast + fallback: $safeString")


}
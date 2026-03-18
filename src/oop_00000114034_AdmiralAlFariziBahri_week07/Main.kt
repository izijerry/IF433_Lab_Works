package oop_00000114034_AdmiralAlFariziBahri_week07

fun Main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 28)
    val reg2 = RegularUser("Alice", 28)
    println(reg1)
    println("sama? ${reg1 == reg2}")
}
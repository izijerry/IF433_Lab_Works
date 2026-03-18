package oop_00000114034_AdmiralAlFariziBahri_week07

fun Main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = RegularUser("Alice", 28)
    val data2 = RegularUser("Alice", 28)
    println(data1)
    println("sama? ${data1 == data2}")
}
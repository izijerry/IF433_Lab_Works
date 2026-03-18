package oop_00000114034_AdmiralAlFariziBahri_week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = Datauser("Alice", 28)
    val data2 = Datauser("Alice", 28)
    println(data1)
    println("sama? ${data1 == data2}")


    val data3 = data1.copy(age = 28)
    println("hasil copy data3: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur userAge: $userAge")
}
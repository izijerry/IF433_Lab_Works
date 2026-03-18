package oop_00000114034_AdmiralAlFariziBahri_week07

object DatabaseManager {
    var connectionStatus: String = "Disconnect"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}
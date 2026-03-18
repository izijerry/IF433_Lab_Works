package oop_00000114034_AdmiralAlFariziBahri_week07

class NetworkClient private constructor(val url: String) {
    const val BASE_URL = "https://api.umn.ac.id"

    fun createClient(): NetworkClient {
        println("Membangun network client dengan BASE_URL: $BASE_URL")
        return NetworkClient(BASE_URL)
    }

    fun connect(){
        println("Connecting to $url")
    }
}